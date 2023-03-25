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

    public Student(UUID id, String type, String firstName, String lastName, String userName, String email, String password) {
        super(id, type, firstName, lastName, userName, email, password);
    }

    public Student(String type, String firstName, String lastName, String userName, String email, String password) {
        super(type, firstName, lastName, userName, email, password);
    }

}
