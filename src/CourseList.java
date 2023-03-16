import java.util.ArrayList;

public class CourseList {
    private CourseList courseList;
    private ArrayList<CourseProgress> courses;
    
    private CourseList() {
        
    }

    public UserList addCourseList(UserList userList) {
        return null;
    }

    public void deleteCourseList(UserList userList) {

    }

    public void editCourseList(UserList userList) {

    }

    public CourseList getInstance() {
        if(courseList == null) {
            courseList = new CourseList();
        }
        return courseList;
    }

    public ArrayList<CourseProgress> getCourses(String keyword) {
        return null;
    }
}
