// Cart class


class Cart {
    // Other attributes and constructor

    private List<Product> items;

    public Cart(int cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total * 1.065; // Adding 6.5% GST
    }
    private List<Product> items;

    public Cart(int cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total * 1.065; // Adding 6.5% GST
    }
}
