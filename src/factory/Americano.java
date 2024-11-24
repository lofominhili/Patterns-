package factory;

public class Americano extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing an Americano...");
    }
}