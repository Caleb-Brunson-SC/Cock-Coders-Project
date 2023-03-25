package backEnd;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public abstract class User {
    private UUID id;
    private String type;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;

    public User(String type, String firstName, String lastName, String userName, String email, String password) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(UUID id, String type, String firstName, String lastName, String userName, String email, String password) {
        this.id = id;
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    //GETTERS AND SETTERS
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public Course viewCourse(Course currentCourse) {
    //     return currentCourse;
    // }

    // public Topic viewTopic(Topic currentTopic) {
    //     return currentTopic;
    // }

    // public Lesson viewLesson(Lesson currentLesson) {
    //     return currentLesson;
    // }

    @Override
    public String toString() {
        return "User [id=" + id + ", type=" + type + ", firstName=" + firstName + ", lastName=" + lastName
                + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
    }
}
