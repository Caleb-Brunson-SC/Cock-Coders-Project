package src;
import java.util.ArrayList;
import java.time.LocalDate;

public class dataTester {
    public static void main(String args[])  {  
        System.out.println("Testing DataLoader");

        System.out.println("--------------------------------------------------------------------\n");
        //UserList us = UserList.getInstance();
        //printUsers(us.getUsers());
        CourseList cs = CourseList.getInstance();
        ArrayList<Course> courses = cs.getCourses();
        Course course = courses.get(0);
        //System.out.println(course.getId());
        
        printCourses(courses);
        System.out.println("\n \n");
        //System.out.println(courses.get(0).getTopics());
        
        /*
        System.out.println("--------------------------------------------------------------------\n");
        LocalDate date = LocalDate.of(2020, 1, 8);
        us.addUser("admin", "bob", "jones", "bj32", "bj@gmail.com", date, "5892759fshkag");
        printUsers(us.getUsers());
        
        //us.saveUsers();
        */
    }

    public static void printUsers(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("***" + users.get(i));
        }
    }

    public static void printCourses(ArrayList<Course> courses) {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("***" + courses.get(i));
        }
    }
}
