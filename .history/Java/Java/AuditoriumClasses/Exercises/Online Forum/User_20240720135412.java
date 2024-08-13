public class User {
    private String username;
    private String avatar;
    private String bio;

    public User(String username, String avatar, String bio) {
        this.username = username;
        this.avatar = avatar;
        this.bio = bio;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nAvatar: " + avatar + "\nBio: " + bio;
    }
}


