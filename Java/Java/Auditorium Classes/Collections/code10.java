import java.util.ArrayList;

public class code10 {

    public static void main(String[] args) {
        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");

        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Orange");
        fruits2.add("Grape");

        System.out.println("Fruits 1: " + fruits1);
        System.out.println("Fruits 2: " + fruits2);

        // Join fruits2 to fruits1
        fruits1.addAll(fruits2);

        System.out.println("Joined fruits: " + fruits1);
    }
}