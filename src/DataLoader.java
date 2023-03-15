import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();	
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i=0; i < usersJSON.size(); i++) {
                JSONObject userJSON = (JSONObject)usersJSON.get(i);
				UUID id = UUID.fromString((String)userJSON.get(USER_ID));
                String type = (String)userJSON.get(USER_TYPE);
				String firstName = (String)userJSON.get(USER_FIRST_NAME);
				String lastName = (String)userJSON.get(USER_LAST_NAME);
                String userName = (String)userJSON.get(USER_USER_NAME);
                String email = (String)userJSON.get(USER_EMAIL);
                LocalDate dateOfBirth = LocalDate.parse((String)userJSON.get(USER_DATE_OF_BIRTH)); // must be ISO_LOCAL_DATE format of (YYYY-MM-DD)
                String password = (String)userJSON.get(USER_PASSWORD);

                if (type.equalsIgnoreCase("admin")) {
                    users.add(new Admin(id, firstName, lastName, userName, email, dateOfBirth, password));
                } else if (type.equalsIgnoreCase("teacher")) {
                    users.add(new Teacher(id, firstName, lastName, userName, email, dateOfBirth, password));
                } else if (type.equalsIgnoreCase("student")) {
                    users.add(new Student(id, firstName, lastName, userName, email, dateOfBirth, password));
                }
            }

            return users;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Course> getCourses() {
        return null;
    }
}
