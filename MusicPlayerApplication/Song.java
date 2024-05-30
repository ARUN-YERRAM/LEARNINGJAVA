import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private String album;
    private String filePath; // Path to the audio file

    public Song(String title, String artist, String album, String filePath) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getFilePath() {
        return filePath;
    }
}
