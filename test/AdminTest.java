package test;

import backEnd.Admin;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

public class AdminTest extends Admin {
    private UUID id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private UUID currentCourseID;
    private UUID currentTopicID;
    private UUID currentLessonID;
    private Admin admin;
    
    @Before
    public void setUp() {
        id = UUID.randomUUID();
        firstName = "John";
        lastName = "Doe";
        userName = "johndoe";
        email = "johndoe@example.com";
        password = "password";
        currentCourseID = UUID.randomUUID();
        currentTopicID = UUID.randomUUID();
        currentLessonID = UUID.randomUUID();
        admin = new Admin(id, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);
    }
    
    @After
    public void tearDown() {
        id = null;
        firstName = null;
        lastName = null;
        userName = null;
        email = null;
        password = null;
        currentCourseID = null;
        currentTopicID = null;
        currentLessonID = null;
        admin = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(Admin.NIL_UUID, admin.getId());
        assertEquals("admin", admin.getType());
        assertEquals("none", admin.getFirstName());
        assertEquals("none", admin.getLastName());
        assertEquals("none", admin.getUserName());
        assertEquals("none", admin.getEmail());
        assertEquals("none", admin.getPassword());
        assertEquals(Admin.NIL_UUID, admin.getCurrentCourseID());
        assertEquals(Admin.NIL_UUID, admin.getCurrentTopicID());
        assertEquals(Admin.NIL_UUID, admin.getCurrentLessonID());
    }

    @Test
    public void testParameterizedConstructor() {
        UUID id = UUID.randomUUID();
        UUID courseID = UUID.randomUUID();
        UUID topicID = UUID.randomUUID();
        UUID lessonID = UUID.randomUUID();

        Admin admin = new Admin(id, "John", "Doe", "johndoe", "johndoe@example.com", "password", courseID, topicID, lessonID);

        assertEquals(id, admin.getId());
        assertEquals("admin", admin.getType());
        assertEquals("John", admin.getFirstName());
        assertEquals("Doe", admin.getLastName());
        assertEquals("johndoe", admin.getUserName());
        assertEquals("johndoe@example.com", admin.getEmail());
        assertEquals("password", admin.getPassword());
        assertEquals(courseID, admin.getCurrentCourseID());
        assertEquals(topicID, admin.getCurrentTopicID());
        assertEquals(lessonID, admin.getCurrentLessonID());
    }

    @Test
    public void testParameterizedConstructorWithoutID() {
        UUID courseID = UUID.randomUUID();
        UUID topicID = UUID.randomUUID();
        UUID lessonID = UUID.randomUUID();

        Admin admin = new Admin("John", "Doe", "johndoe", "johndoe@example.com", "password", courseID, topicID, lessonID);

        assertEquals("admin", admin.getType());
        assertEquals("John", admin.getFirstName());
        assertEquals("Doe", admin.getLastName());
        assertEquals("johndoe", admin.getUserName());
        assertEquals("johndoe@example.com", admin.getEmail());
        assertEquals("password", admin.getPassword());
        assertEquals(courseID, admin.getCurrentCourseID());
        assertEquals(topicID, admin.getCurrentTopicID());
        assertEquals(lessonID, admin.getCurrentLessonID());
    }
}
