class PlayerRating {
    private String playerName;
    private int playerPosition;
    private double averageRating;

    public PlayerRating(String playerName, int playerPosition) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
    }

    // Method to calculate average rating with two critics
    public void calculateAverageRating(double rating1, double rating2) {
        averageRating = (rating1 + rating2) / 2.0;
        determineCategory();
    }

    // Method to calculate average rating with three critics
    public void calculateAverageRating(double rating1, double rating2, double rating3) {
        averageRating = (rating1 + rating2 + rating3) / 3.0;
        determineCategory();
    }

    // Method to determine category based on average rating
    private void determineCategory() {
        if (averageRating > 8) {
            System.out.println("the category is A");
        } else if (averageRating > 5 && averageRating <= 8) {
            System.out.println("the category is B");
        } else {
            System.out.println("the category is C");
        }
    }

    // Method to display player details
    public void displayPlayerDetails() {
        System.out.println("the player name is " + playerName);
        System.out.println("the player position is " + playerPosition);
        System.out.println("the average rating is " + averageRating);
    }

    // Main method
    public static void main(String[] args) {
        // Example usage
        PlayerRating player = new PlayerRating("John", 10);
        player.calculateAverageRating(8.0, 9.0);
        player.displayPlayerDetails();
    }
}



