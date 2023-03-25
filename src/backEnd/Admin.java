package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Admin extends User {

    public Admin(UUID id, String firstName, String lastName, String userName, String email, String password) {
        super(id, firstName, lastName, userName, email, password);
    }

    public Admin(String firstName, String lastName, String userName, String email, String password) {
        super(firstName, lastName, userName, email, password);
    }

}
