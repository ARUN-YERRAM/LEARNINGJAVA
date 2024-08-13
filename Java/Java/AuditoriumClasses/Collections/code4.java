import java.util.ArrayList;
import java.util.Collections;

public class code4 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        // Sort the ArrayList in ascending order (default behavior)
        Collections.sort(names);

        System.out.println("Sorted names: " + names);
    }
}