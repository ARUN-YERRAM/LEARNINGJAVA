lass Showtime {
    private int showtimeId;
    private Movie movie;
    private Theater theater;
    private String startTime;
    private String endTime;
    private int availableSeats;

    public Showtime(int showtimeId, Movie movie, Theater theater, String startTime, String endTime, int availableSeats) {
        this.showtimeId = showtimeId;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.endTime = endTime;
        this.availableSeats = availableSeats;
    }

    public int getShowtimeId() {
        return showtimeId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
