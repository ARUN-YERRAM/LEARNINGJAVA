import java.util.ArrayList;

public class code8 {

    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        // Create a third ArrayList and add some different elements
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Date");

        // Compare list1 and list2
        boolean isEqual1 = list1.equals(list2);
        System.out.println("list1 and list2 are equal: " + isEqual1);

        // Compare list1 and list3
        boolean isEqual2 = list1.equals(list3);
        System.out.println("list1 and list3 are equal: " + isEqual2);
    }
}
