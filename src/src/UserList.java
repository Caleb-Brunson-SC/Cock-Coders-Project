package src;
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDate;

public class UserList {
    private ArrayList<User> users;
    private static UserList userList;

    private UserList() {
        users = DataLoader.getUsers();
    }

    public static UserList getInstance() {
        if (userList == null) {
            userList = new UserList();
        }
        return userList;
    }

    public User getUser(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByUUID(UUID id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public boolean haveUser(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addUser(String type, String firstName, String lastName, String userName, String email, LocalDate dateOfBirth, String password) {
        if (haveUser(userName)) {
            return false;
        }

        if (type.equalsIgnoreCase("admin")) {
            users.add(new Admin(firstName, lastName, userName, email, dateOfBirth, password));
        } else if (type.equalsIgnoreCase("teacher")) {
            users.add(new Teacher(firstName, lastName, userName, email, dateOfBirth, password));
        } else if (type.equalsIgnoreCase("student")) {
            users.add(new Student(firstName, lastName, userName, email, dateOfBirth, password));
        }
        return true;
    }

    public void saveUsers() {
        DataWriter.saveUsers();
    }

    //OTHER METHODS
    public User login(String username, String password) {
        User loggedInUser = userList.getUser(username);
        if(authUser(loggedInUser, password)) {
            return loggedInUser;
        }
        return null;
    }

    public User signUp(String type, String firstName, String lastName, String username, String email, LocalDate dateOfBirth, String password) {
        // UserList user = UserList.getInstance();
        if(userList.addUser(type, firstName, lastName, username, email, dateOfBirth, password)) {
            // User successfully added to db
           return userList.getUser(username);
        }
        return null;
    }

    public void signOut(User user) {
        user = null;
    }

    public boolean authUser(User user, String password) {
        if (user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    //public void deleteUserList(UserList userList) {} may remove or edit this

    //public void editUserList(UserList userList) {} may remove or edit this
}
