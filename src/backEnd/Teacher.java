package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends User {
    private ArrayList<Course> coursesCreated;

    public Teacher(UUID id, String firstName, String lastName, String userName, String email, String password) {
        super(id, firstName, lastName, userName, email, password);
    }

    public Teacher(String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
    }

}
