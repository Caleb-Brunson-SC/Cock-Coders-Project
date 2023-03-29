package backEnd;
import java.util.UUID;
import java.util.ArrayList;
import javax.swing.*;  
import java.awt.event.*;  

public class LMSFacade {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    JFrame frame1;
    private UserList users;
    private CourseList courses;
    private User user; // the current user
    // Objects for creating a course
    private Course courseCreated;
    private ArrayList<Lesson> lessonsCreated;
    private ArrayList<Question> questionsCreated;

    public LMSFacade() {
        this.users =  UserList.getInstance();
        this.courses = CourseList.getInstance();
        this.user = null;
        this.courseCreated = new Course(); //new Course();
        this.lessonsCreated = new ArrayList<Lesson>();
        this.questionsCreated = new ArrayList<Question>();
    }

    public User getUser() {
        return user;
    }

    public boolean login(String username, String password) {
        User loggedInUser = users.getUser(username);
        if (users.authUser(loggedInUser, password)) {
            this.user = loggedInUser;
            return true;
        } else {
            return false;
        }
    }

    public boolean signUp(String type, String firstName, String lastName, String username, String email, String password) {
        if(users.addUser(type, firstName, lastName, username, email, password, NIL_UUID, NIL_UUID, NIL_UUID)) {
            // User successfully added to db
            this.user = users.getUser(username);
            return true;
        } else {
            return false;
        }
    }

    public void signOut() {
        this.user = null;
    }

    // COURSE CREATION, EDITING, DELETION
    public void printCourseCreated() {
        System.out.println(courseCreated);
    }

    public void createCourse(String title, Language language, String description) {
        courseCreated.setId(UUID.randomUUID());
        courseCreated.setTitle(title);
        courseCreated.setLanguage(language);
        courseCreated.setDescription(description);
        courseCreated.setTeacher(user);

        System.out.println(courseCreated); // testing

        if (user == null) {
            JOptionPane.showMessageDialog(frame1,"User is not logged in.","Alert",JOptionPane.WARNING_MESSAGE);
        } else if (courseCreated.getTopics().isEmpty()) {
            JOptionPane.showMessageDialog(frame1,"Topics are incomplete.","Alert",JOptionPane.WARNING_MESSAGE);
        } else {
            if (courses.addCourse(courseCreated)) {
            } else {
                JOptionPane.showMessageDialog(frame1,"Failed to add course.","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void deleteCourse(Course course) {}

    public void createTopic(String title, String description) {
        
    }

    public void deleteTopic(Topic topic) {}


    public void createLesson(String title, String content) {
        
    }

    public void deleteLesson(Lesson lesson) {}


    public void createQuiz(Quiz quiz) {

    }

    public void deleteQuiz(Quiz quiz) {}

    public Comment createComment() {
        return null;
    }

    public void deleteComment() {}

    public void editComment() {}

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {}

    public void editReview(Review review) {}

    // SEARCHING FUNCTIONALITY
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

    // NAVIGATION
    public Course viewCourse() {
        return null;
    }

    public Topic viewTopic() {
        return null;
    }

    public Lesson viewLesson() {
        return null;
    }

    public Lesson viewQuiz() {
        return null;
    }

    public void viewDashboard() {}

    public void viewSettings() {}

    public void viewProfile() {}

    // QUIZ TAKING AND GRADING
    public void takeQuiz() {}

    public boolean completedQuiz(Quiz quiz) {
        return true;
    }

    // ADMIN PRIVLEDGES OVER TEACHERS
    public void addTeacher(Teacher teacher) {}

    public void removeTeacher(Teacher teacher) {}

}
