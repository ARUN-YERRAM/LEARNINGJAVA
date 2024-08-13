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

    // Getters and setters

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

    // Getters and setters

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

    // Getters and setters
}

