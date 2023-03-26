package backEnd;
//import java.util.ArrayList;
import java.util.UUID;

public class Teacher extends User {
    //private ArrayList<Course> coursesCreated;

    public Teacher(UUID id, String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Teacher(String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

}
