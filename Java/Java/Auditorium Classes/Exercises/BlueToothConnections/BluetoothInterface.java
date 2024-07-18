public interface BluetoothInterface {
    // Variables are Public, Static and Final
    // Methods are Public and Abstract 

    // Method to enable Bluetooth
    void enableBluetooth();

    // Method to disable Bluetooth
    void disableBluetooth();

    // Method to establish a connection with another device
    boolean connectToDevice(String deviceName);

    // Method to disconnect from a connected device
    void disconnectDevice();

    // Method to send data to the connected device
    void sendData(byte[] data);

    // Method to receive data from the connected device
    byte[] receiveData();
}