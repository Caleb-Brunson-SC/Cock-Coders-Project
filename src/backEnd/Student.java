package backEnd;
//import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    //private ArrayList<StudentProgress> coursesEnrolled;
    //private ArrayList<StudentProgress> coursesCompleted;

    public Student() {
        super(NIL_UUID, "student", "none", "none", "none", "none", "none", NIL_UUID, NIL_UUID, NIL_UUID);
    }

    public Student(UUID id, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, "student", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Student(String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super("student", firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }
}
