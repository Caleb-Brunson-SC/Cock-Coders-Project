package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private StudentProgress student;
    private ArrayList<StudentProgress> coursesEnrolled;
    private ArrayList<StudentProgress> coursesCompleted;

    public Student(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(id, firstName, lastName, userName, email, dateOfBirth, password);
    }

    public Student(String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(firstName, lastName, userName, email, dateOfBirth, password);
    }

    public void Quiz() {

    }

    public boolean completedQuiz() {
        if((student.getQuizGrades()) != null) {
            return true;
        } else {
            return false;
        }
    }

    public StudentProgress getCourseProgressByKeyword(String keyword) {
        return null;
    }

    public ArrayList<StudentProgress> getAllCourseProgress() {
        return null;
    }

    public Review createReview(Review review) {
        return null;
    }

    public void deleteReview(Review review) {

    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }
}
