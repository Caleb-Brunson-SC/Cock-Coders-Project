package test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import backEnd.Student;
import backEnd.User;
import backEnd.UserList;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.UUID;

public class UserListTest {

    static UserList testList = new UserList();

    @BeforeClass
    public static void setupClass() {
        

        //testList.addUser("Student", "Joe", "Smith","jsmith", "smith@email.com", "jsmithpw", UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());
        // testList.addUser("Student", "Loe", "Fmith","lfmith", "fmith@email.com", "fmmithpw", UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());
        // testList.addUser("Student", "Soe", "Jmith","sjmith", "jmith@email.com", "sjmithpw", UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());

    }

    
    //list.addUser( );

    
    @Test
    public void getUser() {
        // expected variable, actualy variable, compare
        // User newUser = new Student("Danny", "Phantom","dphan", "phantom@email.com", "dphan", UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()) ;
        // testList.addUser("Student", "Danny", "Phantom","dphan", "phantom@email.com", "dphan", UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID());
        // User expected = null;
        // User actually = testList.getUser("dphan");

        // assertEquals("Test getting User", expected, actually);
        // assertEquals(expected, actually);

    }
    
}
