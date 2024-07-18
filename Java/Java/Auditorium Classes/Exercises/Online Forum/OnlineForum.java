import java.util.ArrayList;
import java.util.List;

public class OnlineForum {
    private List<Forum> forums;
    private List<User> users;

    public OnlineForum() {
        this.forums = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void registerUser(String username, String avatar, String bio) {
        User newUser = new User(username, avatar, bio);
        users.add(newUser);
        System.out.println("New user registered: " + username);
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void createForum(String name) {
        Forum newForum = new Forum(name);
        forums.add(newForum);
        System.out.println("New forum created: " + name);
    }

    public List<Forum> getForums() {
        return forums;
    }

    public static void main(String[] args) {
        OnlineForum onlineForum = new OnlineForum();
        
        // Registering users
        onlineForum.registerUser("alice", "avatar1.png", "Hello, I'm Alice.");
        onlineForum.registerUser("bob", "avatar2.png", "Hey there, I'm Bob.");
        
        // Creating forums
        onlineForum.createForum("Technology");
        onlineForum.createForum("Gaming");
        
        // User interactions
        User alice = onlineForum.getUser("alice");
        User bob = onlineForum.getUser("bob");

        if (alice != null && bob != null) {
            Forum techForum = onlineForum.getForums().get(0);
            techForum.createThread("Latest Tech Trends", alice);

            Thread techThread = techForum.getThreads().get(0);
            techThread.addPost(bob, "I think AI is the most exciting trend right now.");
            techThread.addPost(alice, "Absolutely! AI is revolutionizing everything.");
        }
    }
}
