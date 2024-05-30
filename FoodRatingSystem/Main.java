
public class Main {
    public static void main(String[] args) {
        // Create a food rating system
        FoodRatingSystem system = new FoodRatingSystem();

        // Add some food items
        system.addFoodItem(new FoodItem(1, "Pizza", "Italian", 4.5f));
        system.addFoodItem(new FoodItem(2, "Sushi", "Japanese", 4.8f));
        system.addFoodItem(new FoodItem(3, "Tacos", "Mexican", 4.2f));
        system.addFoodItem(new FoodItem(4, "Pad Thai", "Thai", 4.6f));

        // Modify the rating of a food item
        system.modifyRating(1, 4.7f);

        // Get all food items
        System.out.println("All food items:");
        for (FoodItem item : system.getAllFoodItems()) {
            System.out.println(item.getName() + " " + item.getCuisine() + " " + item.getRating());
        }

        // Get the highest rated food for a cuisine
        String cuisine = "Italian";
        FoodItem highestRatedFood = system.getHighestRatedFood(cuisine);
        if (highestRatedFood != null) {
            System.out.println("The highest rated " + cuisine + " food is " +
                    highestRatedFood.getName() + " with a rating of " + highestRatedFood.getRating() + ".");
        } else {
            System.out.println("No " + cuisine + " food found.");
        }
    }
}