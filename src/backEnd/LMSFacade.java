package backEnd;
import java.util.UUID;
import java.util.ArrayList;

public class LMSFacade {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UserList users;
    private CourseList courses;
    private User user;

    public LMSFacade() {
        this.users =  UserList.getInstance();
        this.courses = CourseList.getInstance();
        //this.user = null;
    }

    public User getUser() {
        return user;
    }

    public boolean login(String username, String password) {
        User loggedInUser = users.getUser(username);
        if (users.authUser(loggedInUser, password)) {
            this.user = loggedInUser;
            System.out.println(user);
            return true;
        } else {
            return false;
        }
    }

    public boolean signUp(String type, String firstName, String lastName, String username, String email, String password) {
        if(users.addUser(type, firstName, lastName, username, email, password, NIL_UUID, NIL_UUID, NIL_UUID)) {
            // User successfully added to db
            this.user = users.getUser(username);
            System.out.println(user);
            return true;
        } else {
            return false;
        }
    }

    public void signOut() {
        this.user = null;
    }

    public void createCourse(String title, Language language, String description, 
    Teacher teacher, ArrayList<Topic> topics, ArrayList<Review> reviews, 
    ArrayList<Comment> comments, ArrayList<StudentProgress> studentProgresses) {
        if(courses.addCourse(title, language, description, teacher, topics, reviews, comments, studentProgresses)) {
            System.out.println("Course Successfully added!");
        } else {
            System.out.println("Failed to add class.");
        }
    }

    public void deleteCourse(Course course) {

    }

    public Course viewCourse(Course course) {
        return null;
    }

    public boolean createTopic(String title, String description, Quiz quiz, 
    ArrayList<Lesson> lessons) {
        return false;
    }

    public void deleteTopic(Topic topic) {

    }

    public Topic viewTopic(Topic topic) {
        return null;
    }

    public boolean createLesson(String title, String content) {
        return false;
    }

    public void deleteLesson(Lesson lesson) {

    }

    public Lesson viewLesson(Lesson lesson) {
        return null;
    }

    public Topic createQuiz(Quiz quiz) {
        return null;
    }

    public void deleteQuiz(Quiz quiz) {

    }

    public void takeQuiz(Quiz quiz) {
        if(quiz != null) {

        }
    }

    public boolean completedQuiz(Quiz quiz) {
        return true;
    } 

    public void addTeacher(Teacher teacher) {

    }

    public void removeTeacher(Teacher teacher) {

    }

    public ArrayList<Course> getCourseByKeyword(String keyword) {
        return null;
    }

    public Course getCourseByTeacher(String teacherName) {
        return null;
    }

    public Course getCourseByRating(int rating) {
        return null;
    }

    public ArrayList<StudentProgress> getCourseProgress() {
        return null;
    }

    public ArrayList<Course> getAllCourses() {
        return null;
    }

    public StudentProgress getCourseProgressByKeyword(String keyword) {
        return null;
    }

    public ArrayList<StudentProgress> getAllCourseProgress() {
        return null;
    }

    public void viewDashboard() {

    }

    public void viewSettings() {

    }

    public void viewProfile() {

    }

    public Comment createComment() {
        return null;
    }

    public void deleteComment() {

    }

    public void editComment() {

    }

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {
        
    }
}
