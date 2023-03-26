package backEnd;
//import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    //private ArrayList<StudentProgress> coursesEnrolled;
    //private ArrayList<StudentProgress> coursesCompleted;

    public Student(UUID id, String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(id, type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

    public Student(String type, String firstName, String lastName, String userName, 
    String email, String password, UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        super(type, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }

}
