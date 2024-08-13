import java.util.ArrayList;
import java.util.Collections;

public class code5 {

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

        // Shuffle the list
        Collections.shuffle(list);

        // Print the shuffled list
        System.out.println("Shuffled list: " + list);
    }
}
