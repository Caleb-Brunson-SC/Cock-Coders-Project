package src;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Admin extends User {
    private ArrayList<Teacher> teachers;

    public Admin(UUID id, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(id, firstName, lastName, userName, email, dateOfBirth, password);
    }

    public Admin(String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        super(firstName, lastName, userName, email, dateOfBirth, password);
    }

    public void addTeacher(Teacher teacher) {
        if(teacher != null) {
            teachers.add(teacher);
        }
    }

    public void removeTeacher(Teacher teacher) {
        if(teacher != null) {
            teachers.remove(teacher);
        }
    }
}
