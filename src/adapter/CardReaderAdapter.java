package adapter;

public class CardReaderAdapter implements Usb {

    private final MemoryCard memoryCard;

    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readFromCard();
    }
}
