


public class Inheritance {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        // Call methods inherited from Animal class
        dog.eat(); // Output: Buddy is eating.
        cat.eat(); // Output: Whiskers is eating.
        
        // Call methods specific to Dog and Cat
        dog.bark(); // Output: Buddy is barking.
        cat.meow(); // Output: Whiskers is meowing.
    }
}

// Superclass or base class
class Animal {
    // Attribute
    String name;
    
    // Constructor
    public Animal(String name) {
        this.name = name;
    }
    
    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass or derived class (inherits from Animal)
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        // Call superclass constructor
        super(name);
    }
    
    // Method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Subclass or derived class (inherits from Animal)
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        // Call superclass constructor
        super(name);
    }
    
    // Method specific to Cat
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}
