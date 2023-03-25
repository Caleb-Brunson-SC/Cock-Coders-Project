package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private ArrayList<StudentProgress> coursesEnrolled;
    private ArrayList<StudentProgress> coursesCompleted;

    public Student(UUID id, String type, String firstName, String lastName, String userName, String email, String password) {
        super(id, type, firstName, lastName, userName, email, password);
    }

    public Student(String type, String firstName, String lastName, String userName, String email, String password) {
        super(type, firstName, lastName, userName, email, password);
    }

}
