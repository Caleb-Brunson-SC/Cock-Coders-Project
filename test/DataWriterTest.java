package test;
import backEnd.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class DataWriterTest {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    public UserList userList = UserList.getInstance();
	public ArrayList<User> users = userList.getUsers();
    public CourseList courseList = CourseList.getInstance();
    public ArrayList<Course> courses = courseList.getCourses();

    @Before
    public void setup() {
        UserList.getInstance().getUsers().clear();
		DataWriter.saveUsers();

        CourseList.getInstance().getCourses().clear();
		DataWriter.saveCourses();
    }

    @After
    public void tearDown() {
        UserList.getInstance().getUsers().clear();
		DataWriter.saveUsers();

        CourseList.getInstance().getCourses().clear();
		DataWriter.saveCourses();
    }

    // Users
    @Test
    public void testWritingZeroUsers() {
        users = DataLoader.getUsers();
        assertEquals(0, users.size());
    }

    
    @Test
    public void testWritingOneUser() {
        users.add(new Student("bob", "jones", "bjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));
        DataWriter.saveUsers();
        assertEquals("bjones", DataLoader.getUsers().get(0).getUserName());
    }

    
    @Test
    public void testWritingFiveUsers() {
        users.add(new Student("bob", "jones", "abjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));
        users.add(new Student("bob", "jones", "bbjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));
        users.add(new Student("bob", "jones", "cbjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));
        users.add(new Student("bob", "jones", "dbjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));
        users.add(new Student("bob", "jones", "ebjones", "bj@gmail.com", "bj123", NIL_UUID, NIL_UUID, NIL_UUID));    
        DataWriter.saveUsers();
        assertEquals("ebjones", DataLoader.getUsers().get(4).getUserName());
    }

    @Test
	public void testWritingEmptyUser() {
        users.add(new Student(NIL_UUID, "", "", "", "", "", NIL_UUID, NIL_UUID, NIL_UUID));
        DataWriter.saveUsers();
		assertEquals("", DataLoader.getUsers().get(0).getUserName());
    }

    @Test
	public void testWritingNullUser() {
        users.add(new Student(NIL_UUID, "", "", null, "", "", NIL_UUID, NIL_UUID, NIL_UUID));
        DataWriter.saveUsers();
		assertEquals(null, DataLoader.getUsers().get(0).getUserName());
    }
    

    // Courses
    /*
    @Test
    public void testWritingZeroCourses() {

    }

    @Test
    public void testWritingOneCourse() {

    }

    @Test
    public void testWritingFiveCourses() {

    }

    @Test
	public void testWritingEmptyCourse() {

    }

    @Test
	public void testWritingNullCourse() {
        
    }
    */
}
