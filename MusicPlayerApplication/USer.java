import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;
    private List<Song> favorites;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
        this.favorites = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        if (playlists.contains(playlist)) {
            playlists.remove(playlist);
        } else {
            System.out.println("Playlist not found in user's playlists.");
        }
    }

    public void addFavorite(Song song) {
        favorites.add(song);
    }

    public void removeFavorite(Song song) {
        if (favorites.contains(song)) {
            favorites.remove(song);
        } else {
            System.out.println("Song not found in user's favorites.");
        }
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Song> getFavorites() {
        return favorites;
    }
}