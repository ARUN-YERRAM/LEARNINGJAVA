import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Product> l = new ArrayList<Product>();
        l.add(new Product("Shampoo", 4.5f, 45.99f, 50));
        l.add(new Product("Soap", 3.2f, 52.99f, 150));
        l.add(new Product("Pant", 5f, 255.00f, 101));
        l.add(new Product("Tshirt", 2.2f, 468.09f, 520));
        l.add(new Product("Jacket", 3.8f, 1452.00f, 750));

        Collections.sort(l);
        System.out.println("Sorted based on price (Default):");
        System.out.println(l);
        System.out.println();
        Collections.sort(l, new RatingFilter());
        System.out.println("Sorted based on rating (RatingFilter):");
        System.out.println(l);
        System.out.println();
        Collections.sort(l, new NumPurchasesFilter());
        System.out.println("Sorted based on number of purchases (NumPurchases):");
        System.out.println(l);
        System.out.println();
        Collections.sort(l, new NameFilter());
        System.out.println("Sorted based on name (NameFilter):");
        System.out.println(l);

        l.stream().filter(p->{if (p.price>0) {System.out.println(p.name);return true;} else {return false;}});
    }
}