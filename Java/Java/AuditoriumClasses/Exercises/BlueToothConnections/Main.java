public class Main {
    public static void main(String[] args) {
        Computer c = new Computer("Lenovo", 256, 12);
        Computer c1 = new Computer("Dell", 512, 8);

        c.displaySpecs();
        c.powerOn();
        c.enableBluetooth();

        // BluetoothInterface b = new Computer("Asus", 1000, 16); // Restricts the access to the methods according to the parent's methods 
        c1.getPassword();

        
        Hotspot h1 = new Computer("Asus", 1000, 16);
        h1.changeSignalStrength();

        Hotspot.hello();
    }
}
