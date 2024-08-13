package DSA;

// Correct abstract class definition
abstract class Car {
    abstract void demo();  // Abstract method that must be implemented by subclasses
}

public class abs extends Car {
    // Implementation of the abstract method from Car
    void demo() {
        System.out.println("Start!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public static void main(String[] args) {
        abs obj = new abs();
        obj.demo();  // Calls the demo method
    }
}
