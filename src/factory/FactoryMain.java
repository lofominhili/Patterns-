package factory;

public class FactoryMain {

    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);

        Coffee americano = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);
    }
}
