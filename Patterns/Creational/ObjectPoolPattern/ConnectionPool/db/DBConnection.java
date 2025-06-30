package Patterns.Creational.ObjectPoolPattern.ConnectionPool.db;

public class DBConnection {
    String id;
    DBConnection(String id) {
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("DB Connection ID: " + id);
    }
}