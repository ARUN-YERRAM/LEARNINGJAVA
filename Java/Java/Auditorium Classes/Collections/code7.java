import java.util.ArrayList;
import java.util.Collections;

public class code7 {

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

        // Reverse the list
        Collections.reverse(list);

        // Print the reversed list
        System.out.println("Reversed list: " + list);
    }
}
