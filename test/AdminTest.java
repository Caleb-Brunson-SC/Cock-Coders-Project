package test;

import backEnd.Admin;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.UUID;

public class AdminTest extends Admin {
    private Admin admin;

    @Before
    public void setUp() throws Exception {
        admin = new Admin();
    }

    @Test
    public void testConstructorWithId() {
        UUID id = UUID.randomUUID();
        String firstName = "John";
        String lastName = "Doe";
        String userName = "johndoe";
        String email = "johndoe@example.com";
        String password = "password123";
        UUID currentCourseID = UUID.randomUUID();
        UUID currentTopicID = UUID.randomUUID();
        UUID currentLessonID = UUID.randomUUID();

        admin = new Admin(id, firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);

        Assert.assertEquals(id, admin.getId());
        Assert.assertEquals(firstName, admin.getFirstName());
        Assert.assertEquals(lastName, admin.getLastName());
        Assert.assertEquals(userName, admin.getUserName());
        Assert.assertEquals(email, admin.getEmail());
        Assert.assertEquals(password, admin.getPassword());
        Assert.assertEquals(currentCourseID, admin.getCurrentCourseID());
        Assert.assertEquals(currentTopicID, admin.getCurrentTopicID());
        Assert.assertEquals(currentLessonID, admin.getCurrentLessonID());
    }

    @Test
    public void testConstructorWithoutId() {
        String firstName = "John";
        String lastName = "Doe";
        String userName = "johndoe";
        String email = "johndoe@example.com";
        String password = "password123";
        UUID currentCourseID = UUID.randomUUID();
        UUID currentTopicID = UUID.randomUUID();
        UUID currentLessonID = UUID.randomUUID();

        admin = new Admin(firstName, lastName, userName, email, password, currentCourseID, currentTopicID, currentLessonID);

        Assert.assertEquals("admin", admin.getType());
        Assert.assertEquals(firstName, admin.getFirstName());
        Assert.assertEquals(lastName, admin.getLastName());
        Assert.assertEquals(userName, admin.getUserName());
        Assert.assertEquals(email, admin.getEmail());
        Assert.assertEquals(password, admin.getPassword());
        Assert.assertEquals(currentCourseID, admin.getCurrentCourseID());
        Assert.assertEquals(currentTopicID, admin.getCurrentTopicID());
        Assert.assertEquals(currentLessonID, admin.getCurrentLessonID());
    }
}
