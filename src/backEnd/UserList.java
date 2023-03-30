package backEnd;
import java.util.ArrayList;
import java.util.UUID;

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

    public boolean haveEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean addUser(String type, String firstName, String lastName, String userName, String email, String password,
    UUID currentCourseID, UUID currentTopicID, UUID currentLessonID) {
        if (haveUser(userName) || haveUser(email)) {
            return false;
        }

        if (type.equalsIgnoreCase("admin")) {
            System.out.println("Input Admin");
            users.add(new Admin(firstName, lastName, userName, email, password,
            currentCourseID, currentTopicID, currentLessonID));
        } else if (type.equalsIgnoreCase("teacher")) {
            System.out.println("Input Teacher");
            users.add(new Teacher(firstName, lastName, userName, email, password,
            currentCourseID, currentTopicID, currentLessonID));
        } else if (type.equalsIgnoreCase("student")) {
            System.out.println("Input Student");
            users.add(new Student(firstName, lastName, userName, email, password,
            currentCourseID, currentTopicID, currentLessonID));
        }
        userList.saveUsers();
        return true;
    }

    public void saveUsers() {
        DataWriter.saveUsers();
    }

    //OTHER METHODS
    public boolean authUser(User user, String password) {
        if (user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    //public void deleteUserList(UserList userList) {} may remove or edit this

    //public void editUserList(UserList userList) {} may remove or edit this
}
