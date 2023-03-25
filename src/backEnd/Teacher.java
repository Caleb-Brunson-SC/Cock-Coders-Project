package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends User {
    private ArrayList<Course> coursesCreated;

    public Teacher(UUID id, String type, String firstName, String lastName, String userName, String email, String password) {
        super(id, type, firstName, lastName, userName, email, password);
    }

    public Teacher(String type, String firstName, String lastName, String userName, String email, String password) {
        super(type, firstName, lastName, userName, email, password);
    }

}
