import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap; // test
import java.util.List; // test

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    public static void saveUsers() {
        UserList users = UserList.getInstance();
        ArrayList<User> userList = users.getUsers();
        JSONArray jsonUsers = new JSONArray();
		
		// Creation of Objects in JSON 
		for(int i=0; i< userList.size(); i++) {
			jsonUsers.add(getUserJSON(userList.get(i)));
		}

        // Write the JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(jsonUsers.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getId().toString());
        userDetails.put(USER_FIRST_NAME, user.getFirstName());
        userDetails.put(USER_LAST_NAME, user.getLastName());
        userDetails.put(USER_USER_NAME, user.getUserName());
        userDetails.put(USER_EMAIL, user.getEmail());
        userDetails.put(USER_DATE_OF_BIRTH, user.getDateOfBirth().toString());
        userDetails.put(USER_PASSWORD, user.getPassword());

        return userDetails;
    }

    public static void saveCourses() {
        CourseList courses = CourseList.getInstance();
        ArrayList<Course> courseList = courses.getCourses();
        JSONArray jsonCourses = new JSONArray();

        // Creation of Objects in JSON 
		for(int i=0; i< courseList.size(); i++) {
			jsonCourses.add(getCourseJSON(courseList.get(i)));
		}

        // Write the JSON file
        try (FileWriter file = new FileWriter("json/test.json")) { // Change this to COURSE_FILE_NAME
            file.write(jsonCourses.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getCourseJSON(Course course) {
        JSONObject courseDetails = new JSONObject();
        courseDetails.put(COURSE_ID, course.getId().toString());
        courseDetails.put(COURSE_TITLE, course.getTitle());
        courseDetails.put(COURSE_LANGUAGE, course.getLanguage().toString());
        courseDetails.put(COURSE_DESCRIPTION, course.getDescription());
        courseDetails.put(COURSE_TEACHER_ID, course.getTeacher().getId().toString());

        // Students: studentProgress
        JSONArray studentsArray = new JSONArray();
        for (StudentProgress sp : course.getStudentProgresses()) {
            JSONObject studentsDetails = new JSONObject();
            studentsDetails.put(COURSE_STUDENT_ID, sp.getStudent().getId().toString());
            studentsDetails.put(COURSE_QUIZ_GRADES, sp.getQuizGrades());
            studentsDetails.put(COURSE_CURRENT_TOPIC_INDEX, sp.getCurrentTopicIndex());
            studentsArray.add(studentsDetails);
        }
        courseDetails.put(COURSE_STUDENTS, studentsArray);

        // Topics
        JSONArray topicsArray = new JSONArray();
        for (Topic t : course.getTopics()) {
            JSONObject topicsDetails = new JSONObject();
            topicsDetails.put(COURSE_ID, t.getId().toString());
            topicsDetails.put(COURSE_TITLE, t.getTitle());
            topicsDetails.put(COURSE_DESCRIPTION, t.getDescription());
            // Lessons
            JSONArray lessonsArray = new JSONArray();
            for (Lesson l : t.getLessons()) {
                JSONObject lessonsDetails = new JSONObject();
                lessonsDetails.put(COURSE_ID, l.getId().toString());
                lessonsDetails.put(COURSE_TITLE, l.getTitle());
                lessonsDetails.put(COURSE_CONTENT, l.getContent());

                // Comments
                JSONArray commentsArray = new JSONArray();
                ArrayList<Comment> comments = l.getComments();
                commentRecursionJSON(commentsArray, comments);
                lessonsDetails.put(COURSE_COMMENTS, commentsArray);
                lessonsArray.add(lessonsDetails);
            }
            topicsDetails.put(COURSE_LESSONS, lessonsArray);
            topicsArray.add(topicsDetails);
        }
        courseDetails.put(COURSE_TOPICS, topicsArray);

        // Comments
        

        // Reviews
        //JSONArray reviewsArray = new JSONArray();
        //for (Review r : course.getReviews()) {
            //JSONObject reviewsDetails = new JSONObject();
            //reviewsArray.add(reviewsDetails);
        //}
        //courseDetails.put(COURSE_REVIEWS, reviewsArray);

        return courseDetails;
    }

    public static void commentRecursionJSON(JSONArray commentsArray, ArrayList<Comment> comments) {
        for (Comment c : comments) {
            JSONObject commentsDetails = new JSONObject();
            commentsDetails.put(COURSE_ID, c.getId().toString());
            commentsDetails.put(COURSE_USER_ID, c.getUser().getId().toString());
            commentsDetails.put(COURSE_DATE, c.getDate().toString());
            commentsDetails.put(COURSE_CONTENT, c.getContent());

            JSONArray repliesArray = new JSONArray();
            ArrayList<Comment> replies = c.getReplys();

            if (!replies.isEmpty()) {
                commentRecursionJSON(repliesArray, replies);
                commentsDetails.put(COURSE_REPLYS, repliesArray);
            } else {
                commentsDetails.put(COURSE_REPLYS, new ArrayList<Comment>());
            }

            commentsArray.add(commentsDetails);
        }
    }

    

    public static void main(String args[])  {  
        //Test
        CourseList cs = CourseList.getInstance();
        cs.saveCourses();
    }

}
