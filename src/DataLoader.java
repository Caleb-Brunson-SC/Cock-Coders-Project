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
                    users.add(new Admin(id, firstName, lastName, userName, email, dateOfBirth, password));
                } else if (type.equalsIgnoreCase("teacher")) {
                    users.add(new Teacher(id, firstName, lastName, userName, email, dateOfBirth, password));
                } else if (type.equalsIgnoreCase("student")) {
                    users.add(new Student(id, firstName, lastName, userName, email, dateOfBirth, password));
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
            FileReader reader = new FileReader(COURSE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray coursesJSON = (JSONArray)new JSONParser().parse(reader);

            for (Object o : coursesJSON) {
                // Instatiate objects
                Teacher teacher;
                ArrayList<Topic> topics = new ArrayList<Topic>();
                ArrayList<Review> reviews = new ArrayList<Review>();
                ArrayList<Comment> comments = new ArrayList<Comment>();
                ArrayList<StudentProgress> studentProgresses = new ArrayList<StudentProgress>();

                // JSON course object
                JSONObject courseJSON = (JSONObject) o;
                UUID id = UUID.fromString((String)courseJSON.get(USER_ID));
                String title = (String)courseJSON.get(COURSE_TITLE);
                Language language = Enum.valueOf(Language.class, (String)courseJSON.get(COURSE_LANGUAGE));
                String description = (String)courseJSON.get(COURSE_DESCRIPTION);
                UUID teacherID = UUID.fromString((String)courseJSON.get(COURSE_TEACHER_ID));
                teacher = (Teacher) users.getUserByUUID(teacherID);

                JSONArray studentProgressesJSON = (JSONArray)courseJSON.get(COURSE_STUDENTS);
                for (Object s : studentProgressesJSON) {
                    JSONObject studentProgressJSON = (JSONObject) s;
                    UUID studentID = UUID.fromString((String)studentProgressJSON.get(COURSE_STUDENT_ID));
                    Student student = (Student) users.getUserByUUID(studentID);
                    double[] quizGrades = (double[])studentProgressJSON.get(COURSE_QUIZ_GRADES);
                    int currentTopicIndex = (int)studentProgressJSON.get(COURSE_CURRENT_TOPIC_INDEX);

                    studentProgresses.add(new StudentProgress(student, quizGrades, currentTopicIndex));
                }

                JSONArray topicsJSON = (JSONArray)courseJSON.get(COURSE_TOPICS);
                for (Object t : topicsJSON) {

                }

                JSONArray commentsJSON = (JSONArray)courseJSON.get(COURSE_COMMENTS);
                for (Object c : commentsJSON) {

                }

                JSONArray reviewsJSON = (JSONArray)courseJSON.get(COURSE_REVIEWS);
                for (Object r : reviewsJSON) {
                    JSONObject reviewJSON = (JSONObject) r;
                    UUID reviewID = UUID.fromString((String)reviewJSON.get(COURSE_ID));
                    UUID studentID = UUID.fromString((String)reviewJSON.get(COURSE_STUDENT_ID));
                    Student student = (Student)users.getUserByUUID(studentID);
                    LocalDate date = LocalDate.parse((String)reviewJSON.get(COURSE_DATE));
                    int rating = (int)reviewJSON.get(COURSE_RATING);
                    String content = (String)reviewJSON.get(COURSE_CONTENT);

                    reviews.add(new Review(reviewID, student, date, rating, content));
                }

                courses.add(new Course(id, title, language, description, teacher, topics, reviews, comments, studentProgresses));
            }

            return courses;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
