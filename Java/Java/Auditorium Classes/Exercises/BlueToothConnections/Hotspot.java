public interface Hotspot {
    // Variables are Public, Static and Final
    // Methods are Public and Abstract 
    // As of Java 9, a method can also be private because of it's usage in the default methods.
    String password = "kmit123$";
    int noOfDevices = 10;
    void getPassword();
    default void changeSignalStrength() { // This method need not be overridden.
        System.out.println("Changing from Airtel to Jio");
    }
    static void hello(){
        System.out.println("Static method called");
    }
}
