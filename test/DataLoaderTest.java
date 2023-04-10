package test;

import backEnd.*;
import backEnd.UserList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.UUID;

/**
 * JUnit test for DataLoader class
 * Note: first start with users then move to courses
 * @author Caleb Brunson
 */

public class DataLoaderTest {
    public static final UUID NIL_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private UserList userList = UserList.getInstance();
	private ArrayList<User> users = userList.getUsers();

    

    @Before
    public void setup() {
        users.clear();
        users.add(new Student(NIL_UUID, "bob", "jones", "bj32", "bj@gmail.com", "bjiscool123", 
        NIL_UUID, NIL_UUID, NIL_UUID));
        users.add(new Teacher(NIL_UUID, "jeremy", "lewis", "jlewis", "jlewis@gmail.com", "jlewrocks74", 
        NIL_UUID, NIL_UUID, NIL_UUID));
        DataWriter.saveUsers();
    }

    @After
    public void tearDown() {
        UserList.getInstance().getUsers().clear();
        DataWriter.saveUsers();
    }

    @Test
    public void testGetUsersSize() {
        users = DataLoader.getUsers();
        assertEquals(2, users.size());
    }


}
