package adapter;

public class AdapterMain {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();
        Usb cardReaderAdapter = new CardReaderAdapter(memoryCard);

        Computer computer = new Computer();
        computer.readUSB(cardReaderAdapter);
    }
}
