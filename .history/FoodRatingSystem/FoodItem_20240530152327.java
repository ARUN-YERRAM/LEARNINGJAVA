
class FoodItem {
    private int itemId;
    private String name;
    private String cuisine;
    private float rating;

    public FoodItem(int itemId, String name, String cuisine, float rating) {
        this.itemId = itemId;
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public float getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
