import java.util.ArrayList;
import java.util.List;

class OnlineShoppingApp {
    private List<User> users;
    private List<Product> products;

    public OnlineShoppingApp() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public User createUser(String name, String email, String password, String address) {
        int userId = users.size() + 1; // Assuming user IDs start from 1
        User newUser = new User(userId, name, email, password, address);
        users.add(newUser);
        return newUser;
    }

    public List<Product> browseProducts() {
        // Return list of available products
    }

    public void addToCart(User user, Product product) {
        // Find user's cart and add the product
    }

    public void removeFromCart(User user, Product product) {
        // Find user's cart and remove the product
    }

    public double checkout(User user) {
        // Find user's cart and calculate total bill
    }
}
