import java.util.ArrayList;
import java.time.LocalDate;

public class tester {
    public static void main(String args[])  {  
        System.out.println("Testing DataLoader");

        System.out.println("--------------------------------------------------------------------\n");
        UserList us = UserList.getInstance();
        printUsers(us.getUsers());
        
        System.out.println("--------------------------------------------------------------------\n");
        LocalDate date = LocalDate.of(2020, 1, 8);
        us.addUser("admin", "bob", "jones", "bj32", "bj@gmail.com", date, "5892759fshkag");
        printUsers(us.getUsers());
        
        //us.saveUsers(); works but removed indentation formatting on users.json
    }

    public static void printUsers(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("***" + users.get(i));
        }
    }
}
