public class Smartphone implements BluetoothInterface {
    private boolean bluetoothEnabled = false;

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
}


