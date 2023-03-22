package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
<<<<<<< HEAD
=======
    private ArrayList<StudentProgress> coursesEnrolled;
    private ArrayList<StudentProgress> coursesCompleted;
>>>>>>> 7a9a0bb9a0ab3fc086fd850623be24395dbb6f64

    public Student(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(id, firstName, lastName, userName, email, dateOfBirth, password);
    }

    public Student(String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(firstName, lastName, userName, email, dateOfBirth, password);
    }

}
