package backEnd;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i=0; i < usersJSON.size(); i++) {
                JSONObject userJSON = (JSONObject)usersJSON.get(i);
                UUID id = UUID.fromString((String)userJSON.get(USER_ID));
                String type = (String)userJSON.get(USER_TYPE);
                String firstName = (String)userJSON.get(USER_FIRST_NAME);
                String lastName = (String)userJSON.get(USER_LAST_NAME);
                String userName = (String)userJSON.get(USER_USER_NAME);
                String email = (String)userJSON.get(USER_EMAIL);
                LocalDate dateOfBirth = LocalDate.parse((String)userJSON.get(USER_DATE_OF_BIRTH)); // must be ISO_LOCAL_DATE format of (YYYY-MM-DD)
                String password = (String)userJSON.get(USER_PASSWORD);

                if (type.equalsIgnoreCase("admin")) {
                    users.add(new Admin(id, firstName, lastName, userName, email, password));
                } else if (type.equalsIgnoreCase("teacher")) {
                    users.add(new Teacher(id, firstName, lastName, userName, email, password));
                } else if (type.equalsIgnoreCase("student")) {
                    users.add(new Student(id, firstName, lastName, userName, email, password));
                }
            }

            return users;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Course> getCourses() {
        ArrayList<Course> courses = new ArrayList<Course>();
        
        try {
            // UserList to get Users by thier UUIDs
            UserList users = UserList.getInstance();

            // JSON FILE
            FileReader reader = new FileReader(COURSE_FILE_NAME); // COURSE_FILE_NAME
            JSONParser parser = new JSONParser();
            JSONArray coursesJSON = (JSONArray)new JSONParser().parse(reader);

            for (Object o : coursesJSON) {
                // Instatiate objects
                Teacher teacher;
                ArrayList<Topic> topics = new ArrayList<Topic>();
                ArrayList<Review> reviews = new ArrayList<Review>();
                ArrayList<Comment> comments = new ArrayList<Comment>();
                ArrayList<StudentProgress> studentProgresses = new ArrayList<StudentProgress>();

                // Course JSON
                JSONObject courseJSON = (JSONObject) o;
                UUID id = UUID.fromString((String)courseJSON.get(USER_ID));
                String title = (String)courseJSON.get(COURSE_TITLE);
                Language language = Enum.valueOf(Language.class, (String)courseJSON.get(COURSE_LANGUAGE));
                String description = (String)courseJSON.get(COURSE_DESCRIPTION);
                UUID teacherID = UUID.fromString((String)courseJSON.get(COURSE_TEACHER_ID));
                teacher = (Teacher) users.getUserByUUID(teacherID);

                // StudentProgress JSON
                JSONArray studentProgressesJSON = (JSONArray)courseJSON.get(COURSE_STUDENTS);
                for (Object s : studentProgressesJSON) {
                    JSONObject studentProgressJSON = (JSONObject) s;
                    UUID studentID = UUID.fromString((String)studentProgressJSON.get(COURSE_STUDENT_ID));
                    Student student = (Student) users.getUserByUUID(studentID);
                    ArrayList<Double> quizGrades = (ArrayList<Double>) studentProgressJSON.get(COURSE_QUIZ_GRADES);
                    Number currentTopicIndexNum = (Number)studentProgressJSON.get(COURSE_CURRENT_TOPIC_INDEX);
                    int currentTopicIndex = currentTopicIndexNum.intValue();

                    studentProgresses.add(new StudentProgress(student, quizGrades, currentTopicIndex));
                }
                
                // Topic JSON
                JSONArray topicsJSON = (JSONArray)courseJSON.get(COURSE_TOPICS);
                for (Object t : topicsJSON) {
                    JSONObject topicJSON = (JSONObject) t;
                    UUID topicID = UUID.fromString((String)topicJSON.get(COURSE_ID));
                    String topicTitle = (String)topicJSON.get(COURSE_TITLE);
                    String topicDescription = (String)topicJSON.get(COURSE_DESCRIPTION);

                    // Topic -> Lesson JSON
                    ArrayList<Lesson> lessons = new ArrayList<Lesson>();
                    JSONArray lessonsJSON = (JSONArray)topicJSON.get(COURSE_LESSONS);
                    for (Object l : lessonsJSON) {
                        JSONObject lessonJSON = (JSONObject) l;
                        UUID lessonID = UUID.fromString((String)lessonJSON.get(COURSE_ID));
                        String lessonTitle = (String)lessonJSON.get(COURSE_TITLE);
                        String lessonContent = (String)lessonJSON.get(COURSE_CONTENT);

                        // Lesson -> Comments JSON
                        ArrayList<Comment> lessonComments = new ArrayList<Comment>();
                        JSONArray lessonCommentsJSON = (JSONArray)lessonJSON.get(COURSE_COMMENTS);
                        commentRecursionJSON(lessonCommentsJSON, lessonComments);

                        lessons.add(new Lesson(lessonID, lessonTitle, lessonContent, lessonComments));
                    }

                    // Topic -> Quiz JSON
                    JSONObject quizJSON = (JSONObject)topicJSON.get(COURSE_QUIZ);
                    String quizTitle = (String)quizJSON.get(COURSE_TITLE);
                    String quizDescription = (String)quizJSON.get(COURSE_DESCRIPTION);
                    ArrayList<Question> quizQuestions = new ArrayList<Question>();
                    JSONArray questionsJSON = (JSONArray)quizJSON.get(COURSE_QUESTIONS);
                    for (Object qs : questionsJSON) {
                        JSONObject questionJSON = (JSONObject) qs;
                        UUID questionID = UUID.fromString((String)questionJSON.get(COURSE_ID));
                        String question = (String)questionJSON.get(COURSE_QUESTION);
                        ArrayList<String> choices = (ArrayList<String>)questionJSON.get(COURSE_CHOICES);
                        Number correctAnswerIndexNum = (Number)questionJSON.get(COURSE_CORRECT_ANSWER_INDEX);
                        int correctAnswerIndex = correctAnswerIndexNum.intValue();

                        Question quizQuestion = new Question(questionID, question, choices, correctAnswerIndex);
                        quizQuestions.add(quizQuestion);
                    }

                    Quiz quiz = new Quiz(quizTitle, quizDescription, quizQuestions);

                    // Topic -> Comment JSON
                    ArrayList<Comment> topicComments = new ArrayList<Comment>();
                    JSONArray topicCommentsJSON = (JSONArray)topicJSON.get(COURSE_COMMENTS);
                    commentRecursionJSON(topicCommentsJSON, topicComments);

                    topics.add(new Topic(topicID, topicTitle, topicDescription, quiz, lessons, topicComments));
                }

                // Comment JSON
                JSONArray commentsJSON = (JSONArray)courseJSON.get(COURSE_COMMENTS);
                commentRecursionJSON(commentsJSON, comments);

                // Review JSON
                JSONArray reviewsJSON = (JSONArray)courseJSON.get(COURSE_REVIEWS);
                for (Object r : reviewsJSON) {
                    JSONObject reviewJSON = (JSONObject) r;
                    UUID reviewID = UUID.fromString((String)reviewJSON.get(COURSE_ID));
                    UUID studentID = UUID.fromString((String)reviewJSON.get(COURSE_STUDENT_ID));
                    Student student = (Student)users.getUserByUUID(studentID);
                    LocalDate date = LocalDate.parse((String)reviewJSON.get(COURSE_DATE));
                    Number ratingNum = (Number)reviewJSON.get(COURSE_RATING);
                    int rating = ratingNum.intValue();
                    String content = (String)reviewJSON.get(COURSE_CONTENT);

                    reviews.add(new Review(reviewID, student, date, rating, content));
                }

                // Add a new Course object to the list
                courses.add(new Course(id, title, language, description, teacher, topics, reviews, comments, studentProgresses));
            }

            return courses;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void commentRecursionJSON(JSONArray commentsJSON, ArrayList<Comment> comments) {
        try {
            // UserList to get Users by thier UUIDs
            UserList users = UserList.getInstance();

            for (Object c : commentsJSON) {
                JSONObject commentJSON = (JSONObject) c;
                UUID reviewID = UUID.fromString((String)commentJSON.get(COURSE_ID));
                UUID userID = UUID.fromString((String)commentJSON.get(COURSE_USER_ID));
                User user = (User)users.getUserByUUID(userID);
                LocalDate date = LocalDate.parse((String)commentJSON.get(COURSE_DATE));
                String content = (String)commentJSON.get(COURSE_CONTENT);

                ArrayList<Comment> replys = new ArrayList<Comment>();
                JSONArray replysJSON = (JSONArray)commentJSON.get(COURSE_REPLYS);

                if (!replysJSON.isEmpty()) {
                    commentRecursionJSON(replysJSON, replys);
                    comments.add(new Comment(reviewID, user, date, content, replys));
                } else {
                    comments.add(new Comment(reviewID, user, date, content, new ArrayList<Comment>()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
