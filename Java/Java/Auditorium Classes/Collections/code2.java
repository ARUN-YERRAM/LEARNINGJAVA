import java.util.ArrayList;

public class code2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Insert "Yellow" at the first position
        colors.add(0, "Yellow");

        System.out.println("Colors after insertion: " + colors);
    }
}