package DSA;
import java.util.ArrayList;

public class ArrayListE {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String>list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Printing the ArrayList
        System.out.println("ArrayList: " + list);

        // Adding an element at a specific index
        list.add(1, "Orange");

        // Accessing elements using get() method
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements from the ArrayList
        list.remove("Cherry");

        // Iterating over the ArrayList using for-each loop
        System.out.print("Updated ArrayList: ");
        for (String fruit : list)
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Checking if an element is present in the ArrayList
        if (list.contains("Banana")) {
            System.out.println("Banana is present in the ArrayList.");
        } else {
            System.out.println("Banana is not present in the ArrayList.");
        }

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());

        // Clearing all elements from the ArrayList
        list.clear();

        // Checking if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}
