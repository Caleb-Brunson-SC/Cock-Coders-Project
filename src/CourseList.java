import java.util.ArrayList;

public class CourseList {
    private CourseList courseList;
    private ArrayList<StudentProgress> courses;
    
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

    public ArrayList<StudentProgress> getCourses(String keyword) {
        return null;
    }
}
