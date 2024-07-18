import java.util.ArrayList;

public class code3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // Remove the element at index 4 (which is the fifth element)
        numbers.remove(4);

        System.out.println("Numbers after removal: " + numbers);
    }
}