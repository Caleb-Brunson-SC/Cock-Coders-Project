package backEnd;
import java.util.UUID;

public class Admin extends User {

    public Admin(UUID id, String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Admin(String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

}
