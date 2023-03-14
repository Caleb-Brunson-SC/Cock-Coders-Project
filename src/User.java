import java.util.ArrayList;

public class User {
    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String dateOfBirth;
    protected System auth;

    public User login(String username, String password) {
        return null;
    }

    public User signUp(String firstName, String lastName, String username, String email, String dateOfBirth, String password) {
        return null;
    }

    public void signOut() {

    }

    public void viewCourse() {

    }

    public void viewTopic() {

    }

    public void viewLesson() {

    }

    public void viewDashboard() {

    }

    public void viewSettings() {

    }

    public void viewProfile() {

    }

    public Course getCourseByKeyword(String keyword) {
        return null;
    }

    public Course getCourseByTeacher(String teacherName) {
        return null;
    }

    public Course getCourseByRating(int rating) {
        return null;
    }

    public ArrayList<Course> getAllCourses() {
        return null;
    }
}
