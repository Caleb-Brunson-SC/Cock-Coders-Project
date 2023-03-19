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

        List<HashMap<String, String>> listOfMaps = new ArrayList<HashMap<String, String>>();
        for (StudentProgress sp : course.getStudentProgresses()) {
            HashMap<String, String> students = new HashMap<String, String>();
            students.put(COURSE_STUDENT_ID, sp.getStudent().getId().toString());
            listOfMaps.add(students);
        }
        courseDetails.put(COURSE_STUDENTS, listOfMaps);

        return courseDetails;
    }

    public static void main(String args[])  {  
        //Test
        CourseList cs = CourseList.getInstance();
        cs.saveCourses();
    }

}
