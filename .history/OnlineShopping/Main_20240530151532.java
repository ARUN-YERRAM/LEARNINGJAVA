

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the online shopping application
        OnlineShoppingApp app = new OnlineShoppingApp();

        // Creating a new user
        User user1 = app.createUser("John", "john@example.com", "password123", "123 Street, City");

        // Browsing available products
        List<Product> availableProducts = app.browseProducts();

        // Adding products to the user's cart
        app.addToCart(user1, availableProducts.get(0)); // Assuming user adds the first product to the cart
        app.addToCart(user1, availableProducts.get(1)); // Assuming user adds the second product to the cart

        // Removing a product from the cart
        app.removeFromCart(user1, availableProducts.get(0)); // Assuming user removes the first product from the cart

        // Calculating the total bill including 6.5% GST
        double totalBill = app.checkout(user1);

        System.out.println("Total Bill: $" + totalBill);
    }
}
