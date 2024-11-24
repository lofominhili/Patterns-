package proxy;

public class RealDatabaseConnection implements DatabaseConnection {

    private String dbName;

    @Override
    public void connect(String name) {
        this.dbName = name;
        System.out.println(dbName);
    }
}
