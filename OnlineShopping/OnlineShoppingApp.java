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
        return products; // Return list of available products
    }

    public void addToCart(User user, Product product) {
        Cart cart = getUserCart(user);
        if (cart == null) {
            cart = new Cart(user.getUserId());
            user.setCart(cart);
        }
        cart.addItem(product);
    }

    public void removeFromCart(User user, Product product) {
        Cart cart = getUserCart(user);
        if (cart != null) {
            cart.removeItem(product);
        }
    }

    public double checkout(User user) {
        Cart cart = getUserCart(user);
        if (cart != null) {
            return cart.calculateTotal();
        } else {
            return 0.0; // No items in the cart
        }
    }

    private Cart getUserCart(User user) {
        // Find user's cart
        // This could be implemented by searching through the list of users and finding the one with the matching ID,
        // then returning their cart. This implementation depends on how you manage user data.
        return user.getCart(); // Assuming User class has a getCart() method
    }
}
