package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log(new TestClass(), "Some info");
    }
}
