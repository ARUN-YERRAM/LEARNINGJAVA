
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayer {
    private MediaPlayer mediaPlayer;

    public void playSong(Song song) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        Media media = new Media(song.getFilePath());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void pauseSong() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void stopSong() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public void skipSong() {
        // Logic to skip to the next song
    }
}
