package DSA;

import java.io.*;


public class TransientExample {
    public static void main(String[] args) {
        User user = new User("Arun", "mySecretPassword");

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            out.writeObject(user);
            System.out.println("User object serialized: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) in.readObject();
            System.out.println("User object deserialized: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
