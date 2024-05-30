import java.util.ArrayList;
import java.util.List;

class FoodRatingSystem {
    private List<FoodItem> foodItems;

    public FoodRatingSystem() {
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        this.foodItems.add(item);
    }

    public void editFoodItem(int itemId, String newName, String newCuisine) {
        for (FoodItem item : foodItems) {
            if (item.getItemId() == itemId) {
                item.setName(newName);
                item.setCuisine(newCuisine);
                break;
            }
        }
    }

    public void deleteFoodItem(int itemId) {
        for (FoodItem item : foodItems) {
            if (item.getItemId() == itemId) {
                this.foodItems.remove(item);
                break;
            }
        }
    }

    public void modifyRating(int itemId, float rating) {
        for (FoodItem item : foodItems) {
            if (item.getItemId() == itemId) {
                item.setRating(rating);
                break;
            }
        }
    }

    public List<FoodItem> getAllFoodItems() {
        return this.foodItems;
    }

    public FoodItem getHighestRatedFood(String cuisine) {
        FoodItem highestRatedFood = null;
        float maxRating = Float.MIN_VALUE;
        for (FoodItem item : foodItems) {
            if (item.getCuisine().equals(cuisine) && item.getRating() > maxRating) {
                highestRatedFood = item;
                maxRating = item.getRating();
            }
        }
        return highestRatedFood;
    }
}
