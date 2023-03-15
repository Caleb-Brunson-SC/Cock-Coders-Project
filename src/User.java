import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public abstract class User {
    private UUID id;
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String email;
    protected LocalDate dateOfBirth;
    protected String password;

    public User(String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public User(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

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

    public String toString() {
        return "ID: " + id + "; FIRST NAME: " + firstName + "; LAST NAME " + 
        lastName + "; USERNAME: " + userName + "; EMAIL: " + email + "; DATE OF BIRTH: " + 
        dateOfBirth + "; PASSWORD: " + password;
    }
}
