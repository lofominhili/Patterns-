package adapter;

public class Computer {

    public void readUSB(Usb usbDevice) {
        System.out.println("Computer is reading data via USB...");
        usbDevice.readData();
    }
}
