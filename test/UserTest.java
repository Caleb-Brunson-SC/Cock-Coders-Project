package test;

import org.junit.Assert;
import org.junit.Test;

import backEnd.Student;
import backEnd.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.UUID;

public class UserTest {

    @Test
    public void testUserConstructorWithGeneratedId() {
        User user = new Student();

        assertNotNull(user.getId());
        assertEquals("Student", user.getType());
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe", user.getUserName());
        assertEquals("johndoe@example.com", user.getEmail());
        assertEquals("password", user.getPassword());
        assertNotNull(user.getCurrentCourseID());
        assertNotNull(user.getCurrentTopicID());
        assertNotNull(user.getCurrentLessonID());
    }

    @Test
    public void testUserConstructorWithGivenId() {
        UUID userId = UUID.randomUUID();
        User user = new Student();

        assertEquals(userId, user.getId());
        assertEquals("Teacher", user.getType());
        assertEquals("Jane", user.getFirstName());
        assertEquals("Doe", user.getLastName());
        assertEquals("janedoe", user.getUserName());
        assertEquals("janedoe@example.com", user.getEmail());
        assertEquals("password", user.getPassword());
        assertNotNull(user.getCurrentCourseID());
        assertNotNull(user.getCurrentTopicID());
        assertNotNull(user.getCurrentLessonID());
    }

    @Test
    public void testUserToString() {
        UUID userId = UUID.randomUUID();
        User user = new Student();

        String expectedString = "User [id=" + userId + ", type=Admin, firstName=Alice, lastName=Smith, " +
                "userName=alicesmith, email=alicesmith@example.com, password=password, currentCourseID=" +
                user.getCurrentCourseID() + ", currentTopicID=" + user.getCurrentTopicID() +
                ", currentLessonID=" + user.getCurrentLessonID() + "]";

        assertEquals(expectedString, user.toString());
    }
}
