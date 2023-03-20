package src;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends User {
    private ArrayList<Course> coursesCreated;

    public Teacher(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(id, firstName, lastName, userName, email, dateOfBirth, password);
    }

    public Teacher(String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(firstName, lastName, userName, email, dateOfBirth, password);
    }

    public void removeStudent(Student student) {

    }

    public Topic createTopic() {
        return null;
    }

    public Quiz createQuiz() {
        return null;
    }

    public void delteComment() {
        
    }
}
