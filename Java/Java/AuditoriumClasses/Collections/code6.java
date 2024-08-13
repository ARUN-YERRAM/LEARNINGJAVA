import java.util.ArrayList;

public class code6 {

    public static void main(String[] args) {
        // Create an ArrayList and add some initial elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the original list and its size
        System.out.println("Original list: " + list);
        System.out.println("Original size: " + list.size());

        // Ensure the ArrayList can hold at least 10 elements
        list.ensureCapacity(10);

        // Add more elements to the list
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");

        // Print the updated list and its size
        System.out.println("Updated list: " + list);
        System.out.println("Updated size: " + list.size());
    }
}
