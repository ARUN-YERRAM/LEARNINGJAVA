package DSA;

import java.io.*;


public class TransientExample {
    public static void main(String[] args) {
        User user = new User("Arun", "mySecretPassword");

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
            out.writeObject(user);
            System.out.println("User object serialized: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.txt"))) {
            User deserializedUser = (User) in.readObject();
            System.out.println("User object deserialized: " + deserializedUser.username);
            System.out.println("User object deserialized: " + deserializedUser.username);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    String username;
    transient String password; // The password field will not be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }
}