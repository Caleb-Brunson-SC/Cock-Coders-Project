package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;

public class LMSFacade {
    private UserList userList;
    private CourseList courseList;
    private User user; // use this user for information (user.<blank>)
    private Course currentCourse;
    private Lesson currentLesson;
    private Topic currentTopic;
    private Quiz currentQuiz;

    public User login(String username, String password) {
        return user = userList.login(username, password);
    }

    public User signUp(String type, String firstName, String lastName, String username, String email, String password) {
        return user = userList.signUp(type, firstName, lastName, username, email, password);
    }

    public void signOut(User user) {
        userList.signOut(user);

    }

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
