import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.addFirst("Orange");
        linkedList.addLast("Cherry");
        
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        linkedList.set(1, "Date");
        
        System.out.println("Updated LinkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        
        System.out.println("Updated LinkedList after removals: " + linkedList);
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("Contains 'Date': " + linkedList.contains("Date"));
        
        linkedList.clear();
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
    }
}
