package backEnd;
//import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends User {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    //private ArrayList<Course> coursesCreated;

    public Teacher() {
        super(NIL_UUID, "teacher", "none", "none", "none", "none", "none", NIL_UUID, NIL_UUID, NIL_UUID);
    }

    public Teacher(UUID id, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, "teacher", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Teacher(String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super("teacher", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

}
