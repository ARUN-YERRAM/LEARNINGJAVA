import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        // Creating a HashMap of String keys and Integer values
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value by its key
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        // Checking if a key is present in the HashMap
        if (map.containsKey("Cherry")) {
            System.out.println("HashMap contains key 'Cherry'.");
        } else {
            System.out.println("HashMap does not contain key 'Cherry'.");
        }

        // Checking if a value is present in the HashMap
        if (map.containsValue(4)) {
            System.out.println("HashMap contains value 4.");
        } else {
            System.out.println("HashMap does not contain value 4.");
        }

        // Removing a key-value pair by its key
        map.remove("Date");

        // Iterating over the HashMap using a for-each loop
        System.out.println("Updated HashMap:");
        for (Map<String,Integer>map.emtrySet() entry:map.entrySet()){
            
        }

        // Size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clearing all key-value pairs from the HashMap
        map.clear();

        // Checking if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }
}
