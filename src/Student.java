import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private ArrayList<CourseProgress> coursesEnrolled;
    private ArrayList<CourseProgress> coursesCompleted;

    public Student(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(id, firstName, lastName, userName, email, dateOfBirth, password);
    }

    public void takeQuiz() {

    }

    public boolean completedQuiz() {
        return true;
    }

    public CourseProgress getCourseProgressByKeyword(String keyword) {
        return null;
    }

    public ArrayList<CourseProgress> getAllCourseProgress() {
        return null;
    }

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {

    }
}
