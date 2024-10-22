public class Main {
    public static void main(String[] args) {
        // Create movies
        Movie movie1 = new Movie(1, "The Shawshank Redemption", "Drama", 142, 9.3f);
        Movie movie2 = new Movie(2, "The Dark Knight", "Action", 152, 9.0f);

        // Create theaters
        Theater theater1 = new Theater(1, "AMC", "New York", 200);
        Theater theater2 = new Theater(2, "Regal", "Los Angeles", 150);

        // Create showtimes
        Showtime showtime1 = new Showtime(1, movie1, theater1, "2024-06-01 18:00", "2024-06-01 20:30", 150);
        Showtime showtime2 = new Showtime(2, movie1, theater2, "2024-06-01 20:00", "2024-06-01 22:30", 100);
        Showtime showtime3 = new Showtime(3, movie2, theater1, "2024-06-01 17:30", "2024-06-01 20:00", 180);

        // Create tickets
        Ticket ticket1 = new Ticket(1, showtime1, "A10", 15.00f);
        Ticket ticket2 = new Ticket(2, showtime2, "B5", 12.50f);

        // Print some information
        System.out.println("Movies:");
        System.out.println(movie1.getTitle() + " - " + movie1.getGenre());
        System.out.println(movie2.getTitle() + " - " + movie2.getGenre());

        System.out.println("\nTheaters:");
        System.out.println(theater1.getName() + " - " + theater1.getLocation() + " (" + theater1.getCapacity() + " seats)");
        System.out.println(theater2.getName() + " - " + theater2.getLocation() + " (" + theater2.getCapacity() + " seats)");

        System.out.println("\nShowtimes:");
        System.out.println(showtime1.getMovie().getTitle() + " at " + showtime1.getTheater().getName() + " - " + showtime1.getStartTime());
        System.out.println(showtime2.getMovie().getTitle() + " at " + showtime2.getTheater().getName() + " - " + showtime2.getStartTime());
        System.out.println(showtime3.getMovie().getTitle() + " at " + showtime3.getTheater().getName() + " - " + showtime3.getStartTime());

        System.out.println("\nTickets:");
        System.out.println("Ticket 1: " + ticket1.getShowtime().getMovie().getTitle() + " at " + ticket1.getShowtime().getTheater().getName() + " - Seat: " + ticket1.getSeatNumber() + ", Price: $" + ticket1.getPrice());
        System.out.println("Ticket 2: " + ticket2.getShowtime().getMovie().getTitle() + " at " + ticket2.getShowtime().getTheater().getName() + " - Seat: " + ticket2.getSeatNumber() + ", Price: $" + ticket2.getPrice());
    }
}
