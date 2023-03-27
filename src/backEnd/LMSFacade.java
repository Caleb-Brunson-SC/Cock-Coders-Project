package backEnd;
import java.util.ArrayList;

public class LMSFacade {
    private UserList users;
    private CourseList courses;
    private User user;
    private Course currentCourse;
    private Topic currentTopic;
    private Lesson currentLesson;

    public LMSFacade() {
        this.users =  UserList.getInstance();
        this.courses = CourseList.getInstance();
        this.user = null;
        this.currentCourse = null;
        this.currentTopic = null;
        this.currentLesson = null;
    }

    public User login(String username, String password) {
        User user = users.login(username, password);
        // System.out.println(user); // test purposes
        return user;
    }

    public User signUp(String type, String firstName, String lastName, String username, String email, String password) {
        User user = users.signUp(type, firstName, lastName, username, email, password);
        // System.out.println(user); // test purposes
        return user;
    }

    public void signOut(User user) {
        users.signOut(user);
        // System.out.println(user); // test purposes
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
        currentCourse = course;
        return currentCourse;
    }

    public boolean createTopic(String title, String description, Quiz quiz, 
    ArrayList<Lesson> lessons) {
        currentTopic = currentCourse.createTopic(title, description, quiz, lessons);
        if(currentTopic !=  null) {
            return true;
        }
        return false;
    }

    public void deleteTopic(Topic topic) {

    }

    public Topic viewTopic(Topic topic) {
        currentTopic = topic;
        return currentTopic;
    }

    public boolean createLesson(String title, String content) {
        currentLesson = currentTopic.createLesson(title, content);
        if(currentTopic != null) {
            return true;
        }
        return false;
    }

    public void deleteLesson(Lesson lesson) {

    }

    public Lesson viewLesson(Lesson lesson) {
        currentLesson = lesson;
        return currentLesson;
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
