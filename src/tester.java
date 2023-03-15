import java.util.ArrayList;

public class tester {
    public static void main(String args[])  {  
        System.out.println("Testing DataLoader");

        ArrayList<User> users = DataLoader.getUsers();
        System.out.println(users.toString());
        
    }  
}
