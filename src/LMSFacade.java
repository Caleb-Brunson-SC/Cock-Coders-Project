import java.util.ArrayList;

public class LMSFacade {
    private User user; // use this user for information (user.<blank>)
    private Course currentCourse;
    private Lesson currentLesson;
    private Topic currentTopic;
    private Quiz currentQuiz;

    public User login(String username, String password) {
        return null;
    }

    public User signUp(String firstName, String lastName, String username, String email, String dateOfBirth, String password) {
        return null;
    }

    public void signOut() {

    }

    public Course createCourse(Course course) {
        return null;
    }

    public void deleteCourse(Course course) {

    }

    public void viewCourse(Course course) {

    }

    public Topic createTopic(Topic topic) {
        return null;
    }

    public void deleteTopic(Topic topic) {

    }

    public void viewTopic(Topic topic) {

    }

    public Lesson createLesson(Lesson lesson) {
        return null;
    }

    public void deleteLesson(Lesson lesson) {

    }

    public void viewLesson(Lesson lesson) {

    }

    public Topic createQuiz(Quiz quiz) {
        return null;
    }

    public void deleteQuiz(Quiz quiz) {

    }

    public void takeQuiz(Quiz quiz) {

    }

    public boolean completedQuiz(Quiz quiz) {
        return true;
    } 

    public void addTeacher(Teacher teacher) {

    }

    public void removeTeacher(Teacher teacher) {

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
