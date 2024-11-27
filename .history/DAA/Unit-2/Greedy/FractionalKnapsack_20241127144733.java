import java.util.*;

public class FractionalKnapsack {
    
    // Item class to store weight, value, and value/weight ratio
    static class Item {
        int weight, value;
        
        // Constructor
        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    // Method to get the maximum value in the knapsack
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity == 0) {
                break;
            }

            // Take the full item if it fits
            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                // Take the fraction of the item that fits
                totalValue += item.value * ((double) capacity / item.weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of items and knapsack capacity
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        System.out.println("Enter the capacity of the knapsack:");
        int capacity = sc.nextInt();

        // Array of items
        Item[] items = new Item[n];

        System.out.println("Enter the weights and values of the items:");
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items[i] = new Item(weight, value);
        }

        // Calculate and print the maximum value that can be obtained
        System.out.println("Maximum value in knapsack = " + getMaxValue(items, capacity));
    }
}
