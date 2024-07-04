import java.util.*;

class Song {
    int id;
    String title;
    String artist;
    String album;
    String albumArt;

    public Song(int id, String title, String artist, String album, String albumArt) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.albumArt = albumArt;
    }

    @Override
    public String toString() {
        return "Song{id=" + id + ", title='" + title + "', artist='" + artist + "', album='" + album + "', albumArt='" + albumArt + "'}";
    }
}

class Playlist {
    int id;
    String name;
    List<Song> songs;

    public Playlist(int id, String name) {
        this.id = id;
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public String toString() {
        return "Playlist{id=" + id + ", name='" + name + "', songs=" + songs + "}";
    }
}

class MusicPlayer {
    List<Song> songs = new ArrayList<>();
    List<Playlist> playlists = new ArrayList<>();
    int currentSongIndex = -1;
    boolean isPlaying = false;

    public void addSong(Song song) {
        songs.add(song);
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(playlists.size() + 1, name));
    }

    public void playSong(int songId) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).id == songId) {
                currentSongIndex = i;
                isPlaying = true;
                System.out.println("Playing: " + songs.get(i));
                break;
            }
        }
    }

    public void pauseSong() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Paused: " + songs.get(currentSongIndex));
        }
    }

    public void skipSong() {
        if (isPlaying && currentSongIndex < songs.size() - 1) {
            currentSongIndex++;
            System.out.println("Playing: " + songs.get(currentSongIndex));
        }
    }

    public void repeatSong() {
        if (isPlaying) {
            System.out.println("Repeating: " + songs.get(currentSongIndex));
        }
    }

    public void shuffleSongs() {
        Collections.shuffle(songs);
        currentSongIndex = 0;
        isPlaying = true;
        System.out.println("Playing: " + songs.get(currentSongIndex));
    }

    public void addSongToPlaylist(int playlistId, int songId) {
        Playlist playlist = null;
        for (Playlist pl : playlists) {
            if (pl.id == playlistId) {
                playlist = pl;
                break;
            }
        }
        if (playlist != null) {
            for (Song song : songs) {
                if (song.id == songId) {
                    playlist.addSong(song);
                    break;
                }
            }
        }
    }

    public List<Song> listSongs() {
        return new ArrayList<>(songs);
    }

    public List<Playlist> listPlaylists() {
        return new ArrayList<>(playlists);
    }
}

public class Mains {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.addSong(new Song(1, "Song 1", "Artist 1", "Album 1", "AlbumArt1.jpg"));
        player.addSong(new Song(2, "Song 2", "Artist 2", "Album 2", "AlbumArt2.jpg"));
        player.addSong(new Song(3, "Song 3", "Artist 3", "Album 3", "AlbumArt3.jpg"));

        System.out.println("All Songs: " + player.listSongs());

        player.createPlaylist("My Favorites");
        player.addSongToPlaylist(1, 1);
        player.addSongToPlaylist(1, 2);

        System.out.println("All Playlists: " + player.listPlaylists());

        player.playSong(1);
        player.pauseSong();
        player.skipSong();
        player.repeatSong();
        player.shuffleSongs();
    }
}
