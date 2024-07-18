import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String email;
    private String dateOfBirth;
    private String profilePicture;
    private List<User> friends;
    private List<Post> posts;

    public User(String username, String password, String email, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void createPost(String content) {
        Post post = new Post(this, content);
        posts.add(post);
    }
}

class Post {
    private User author;
    private String content;
    private List<Comment> comments;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(User commenter, String commentContent) {
        Comment comment = new Comment(commenter, commentContent);
        comments.add(comment);
    }
}

class Comment {
    private User commenter;
    private String content;

    public Comment(User commenter, String content) {
        this.commenter = commenter;
        this.content = content;
    }

    public User getCommenter() {
        return commenter;
    }

    public String getContent() {
        return content;
    }
}

public class SocialMediaApp {
    private List<User> users;
    private Scanner scanner;

    public SocialMediaApp() {
        this.users = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void registerUser() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter date of birth:");
        String dateOfBirth = scanner.nextLine();
        User newUser = new User(username, password, email, dateOfBirth);
        users.add(newUser);
        System.out.println("User registered successfully!");
    }

    public void login() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                // Implement main menu here
                mainMenu();
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }

    public void mainMenu() {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                login();
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        mainMenu(); // Recursive call to keep displaying the menu
    }

    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();
        app.mainMenu();
    }
}
