package backEnd;
import java.util.ArrayList;

public class LMSFacade {
    private UserList userList;
    private CourseList courseList;
    private User user; // use this user for information (user.<blank>)
    private Course currentCourse;
    private Lesson currentLesson;
    private Topic currentTopic;
    private Quiz currentQuiz;

    // USER RELATED METHODS (userList)
    public User login(String username, String password) {
        return user = userList.login(username, password);
    }

    public User signUp(String type, String firstName, String lastName, String username, String email, String password) {
        return user = userList.signUp(type, firstName, lastName, username, email, password);
    }

    public void signOut(User user) {
        userList.signOut(user);

    }

    public void addTeacher(Teacher teacher) {

    }

    public void removeTeacher(Teacher teacher) {

    }

    public void viewDashboard() {

    }

    public void viewSettings() {

    }

    public void viewProfile() {

    }

    // COURSE RELATED METHODS (courseList)
    public void createCourse(String title, Language language, String description, 
    Teacher teacher, ArrayList<Topic> topics, ArrayList<Review> reviews, 
    ArrayList<Comment> comments, ArrayList<StudentProgress> studentProgresses) {
        if(courseList.addCourse(title, language, description, teacher, topics, reviews, comments, studentProgresses)) {
            System.out.println("Course Successfully added!");
        } else {
            System.out.println("Failed to add class.");
        }
    }

    public void deleteCourse(Course course) {

    }

    public void editCourse(Course course) {
        
    }

    public Course viewCourse() { // Not sure what arguments this should take
        return null; // not sure what this should return
    }

    public Topic createTopic(Topic topic) {
        return null;
    }

    public void deleteTopic(Topic topic) {

    }

    public void editTopic(Topic topic) {

    }

    public Topic viewTopic(Topic topic) {
        return currentTopic;
    }

    public Lesson createLesson(Lesson lesson) {
        return null;
    }

    public void deleteLesson(Lesson lesson) {

    }

    public void editLesson(Lesson lesson) {

    }

    public Lesson viewLesson(Lesson lesson) {
        return currentLesson;
    }

    public Topic createQuiz(Quiz quiz) {
        return null;
    }

    public void deleteQuiz(Quiz quiz) {

    }

    public void editQuiz(Quiz quiz) {

    }

    public void takeQuiz(Quiz quiz) {
        
    }

    public boolean completedQuiz(Quiz quiz) {
        return true;
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

    public void editReview(Review review) {
        
    }

    public ArrayList<Course> getAllCourses() {
        return null;
    }

    public ArrayList<Course> getCourseByKeyword(String keyword) {
        return null;
    }

    public Course getCourseByTeacher(String teacherName) {
        return null;
    }

    public Course getCourseByRating(int rating) { // 1, 2, 3, 4, or 5 "star" ratings
        return null;
    }

    public ArrayList<StudentProgress> getStudentProgress() {
        return null;
    }

    public StudentProgress getStudentProgressByStudent(Student student) {
        return null;
    }

    public ArrayList<StudentProgress> getAllCourseProgress() {
        return null;
    }

    
}
