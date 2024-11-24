package proxy;

public class ProxyMain {

    public static void main(String[] args) {
        RealDatabaseConnection realDatabaseConnection = new RealDatabaseConnection();
        DatabaseProxy dbProxy = new DatabaseProxy(realDatabaseConnection);

        dbProxy.connect("db");
    }
}
