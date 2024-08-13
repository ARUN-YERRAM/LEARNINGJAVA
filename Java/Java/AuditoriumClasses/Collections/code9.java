import java.util.ArrayList;
import java.util.Collections;

public class code9 {

    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");

        // Print the original list
        System.out.println("Original list: " + list);

        // Swap the elements at index 1 (Banana) and index 4 (Elderberry)
        Collections.swap(list, 1, 4);

        // Print the list after swapping
        System.out.println("List after swapping Banana and Elderberry: " + list);
    }
}
