package backEnd;
import java.util.UUID;

public class Admin extends User {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    
    public Admin() {
        super(NIL_UUID, "admin", "none", "none", "none", "none", "none", NIL_UUID, NIL_UUID, NIL_UUID);
    }

    public Admin(UUID id, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, "admin", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Admin(String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super("admin", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

}
