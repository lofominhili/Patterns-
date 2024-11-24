package proxy;

public class DatabaseProxy implements DatabaseConnection {

    private final RealDatabaseConnection realDatabaseConnection;

    public DatabaseProxy(RealDatabaseConnection realDatabaseConnection) {
        this.realDatabaseConnection = realDatabaseConnection;
    }

    @Override
    public void connect(String dbName) {
        System.out.print("Connected to: " + "localhost:3306/");
        realDatabaseConnection.connect(dbName);
    }
}
