public class PlayerRatingTester {
    public static void main(String[] args) {
        PlayerRating player = new PlayerRating("Oscar", 1);
        
        // Calculate average rating with two critics
        player.calculateAverageRating(1.0, 1.0);
        player.displayPlayerDetails();
    }
}

