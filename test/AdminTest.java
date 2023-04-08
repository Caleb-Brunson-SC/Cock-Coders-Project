package test;
import backEnd.Admin;

public class AdminTest extends Admin {
    public static void main(String[] args) {
        testAdminConstructor();
    }

    public static void testAdminConstructor() {
        Admin admin = new Admin();
        if (!admin.getId().equals(NIL_UUID)) {
            System.out.println("Error: Admin UUID not initialized correctly.");
        }
        if (!admin.getUserName().equals("admin")) {
            System.out.println("Error: Admin username not initialized correctly.");
        }
        if (!admin.getPassword().equals("none")) {
            System.out.println("Error: Admin password not initialized correctly.");
        }
        if (!admin.getFirstName().equals("none")) {
            System.out.println("Error: Admin first name not initialized correctly.");
        }
        if (!admin.getLastName().equals("none")) {
            System.out.println("Error: Admin last name not initialized correctly.");
        }
        if (!admin.getEmail().equals("none")) {
            System.out.println("Error: Admin email not initialized correctly.");
        }
    }
}
