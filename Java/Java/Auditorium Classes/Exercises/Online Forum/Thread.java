import java.util.ArrayList;
import java.util.List;

public class Thread {
    private String title;
    private User creator;
    private List<Post> posts;

    public Thread(String title, User creator) {
        this.title = title;
        this.creator = creator;
        this.posts = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public User getCreator() {
        return creator;
    }

    public void addPost(User user, String content) {
        Post newPost = new Post(user, content);
        posts.add(newPost);
        notifyUser(user, "New reply to your thread: " + title);
    }

    public List<Post> getPosts() {
        return posts;
    }

    private void notifyUser(User user, String message) {
        System.out.println("Notification for " + user.getUsername() + ": " + message);
    }

    @Override
    public String toString() {
        return "Thread: " + title + ", Posts: " + posts.size();
    }
}
