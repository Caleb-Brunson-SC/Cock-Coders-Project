package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private StudentProgress student;
    private ArrayList<StudentProgress> coursesEnrolled;
    private ArrayList<StudentProgress> coursesCompleted;

    public Student(UUID id, String firstName, String lastName, String userName, String email, String password) {
        super(id, firstName, lastName, userName, email, password);
    }

    public Student(String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }
}
