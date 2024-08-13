public class Computer extends Electronic implements BluetoothInterface, Hotspot {
    // State specific to computers
    private String brand;
    private int storage; // in gigabytes
    private int ram; // in gigabytes
    private boolean bluetoothEnabled = false;

    // Constructor to initialize the Computer object
    public Computer(String brand, int storage, int ram) {
        super(); // Call the superclass constructor
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    // Implementing BluetoothInterface methods

    @Override
    public void enableBluetooth() {
        bluetoothEnabled = true;
        System.out.println("Bluetooth enabled.");
    }

    @Override
    public void disableBluetooth() {
        bluetoothEnabled = false;
        System.out.println("Bluetooth disabled.");
    }

    @Override
    public boolean connectToDevice(String deviceName) {
        if (bluetoothEnabled) {
            System.out.println("Connecting to " + deviceName + "...");
            // Simulate a successful connection
            return true;
        } else {
            System.out.println("Please enable Bluetooth first.");
            return false;
        }
    }

    @Override
    public void disconnectDevice() {
        if (bluetoothEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Bluetooth is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendData(byte[] data) {
        if (bluetoothEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Bluetooth is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveData() {
        if (bluetoothEnabled) {
        System.out.println("Receiving data...");
        // Simulate receiving data
        return "Received data".getBytes();
        } else {
            System.out.println("Bluetooth is not enabled. Cannot receive data.");
            return new byte[0];
        }
    }

    // Specific behavior for Computer
    public void upgradeRam(int additionalRam) {
        this.ram += additionalRam;
        System.out.println("RAM upgraded. Total RAM: " + ram + " GB.");
    }

    // Overriding the display method to include computer specifics
    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Power status: " + (isOn ? "On" : "Off"));
        System.out.println("Bluetooth status: " + (bluetoothEnabled ? "Enabled" : "Disabled"));
    }

    @Override
    public void getPassword() {
        System.out.println(Hotspot.password);
    }

    @Override
    public void changeSignalStrength() {
        System.out.println("Changing from Airtel to BSNL");
    }
}