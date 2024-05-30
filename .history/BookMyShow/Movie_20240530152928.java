import java.util.ArrayList;
import java.util.List;

class Movie {
    private int movieId;
    private String title;
    private String genre;
    private int duration;
    private float rating;

    public Movie(int movieId, String title, String genre, int duration, float rating) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public float getRating() {
        return rating;
    }
}
