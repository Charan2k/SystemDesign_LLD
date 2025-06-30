package Patterns.Creational.ObjectPoolPattern.ConnectionPool;

import Patterns.Creational.ObjectPoolPattern.ConnectionPool.db.DBConnection;
import Patterns.Creational.ObjectPoolPattern.ConnectionPool.db.DBConnectionPool;

public class Main {
    public static void main(String[] args) {
        DBConnection conn1 = DBConnectionPool.getConnection();
        DBConnection conn2 = DBConnectionPool.getConnection();
        DBConnection conn3 = DBConnectionPool.getConnection();
        DBConnectionPool.getConnection(); // max connections reached, returns null
        DBConnectionPool.getConnection(); // max connections reached, returns null
        conn1.displayDetails();
        conn2.displayDetails();
        conn3.displayDetails();

        DBConnectionPool.releaseConnection(conn1);
        DBConnectionPool.releaseConnection(conn2);
        conn1.displayDetails();
        conn2.displayDetails();
        conn1 = DBConnectionPool.getConnection();
        conn1.displayDetails();

    }
}
