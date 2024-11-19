import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public boolean registerUser(String username, String password, String email) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;  
            }
        }
        users.add(new User(username, password, email));
        return true; 
    }

    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;  
            }
        }
        return false; 
    }

   
    public void listUsers() {
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }
}
