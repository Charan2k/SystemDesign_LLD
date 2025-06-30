package Patterns.Creational.ObjectPoolPattern.ConnectionPool.db;

import java.util.HashMap;
import java.util.Map;

import Patterns.Creational.ObjectPoolPattern.ConnectionPool.Status;
import Patterns.Creational.SingletonPattern.LoggerService.Logger;
import Patterns.Creational.SingletonPattern.LoggerService.LoggerLevel;

public class DBConnectionPool {
    static Map<DBConnection, Status> dbConnectionsMap = new HashMap<DBConnection, Status>();
    static int maxConnections = 3;
    static int currentConnections = 0;

    public static DBConnection getConnection() {
        for(DBConnection key: dbConnectionsMap.keySet()) {
            if(dbConnectionsMap.get(key) == Status.isAvailable) {
                dbConnectionsMap.put(key, Status.isBusy);
                return key;
            }
        }
        if(currentConnections < maxConnections) {
            return createNewConnection();
        }
        Logger logger = Logger.getInstance();
        logger.log("DB Connection Pool is full, please try after sometime.", LoggerLevel.INFO);
        return null;
    }

    private static DBConnection createNewConnection(){
        DBConnection connection = new DBConnection(String.valueOf(++currentConnections));
        dbConnectionsMap.put(connection, Status.isBusy);
        return connection;
    }

    public static void releaseConnection(DBConnection connection) {
        if(!dbConnectionsMap.containsKey(connection)) {
            Logger.getInstance().log("Unknown Connection", LoggerLevel.INFO);
            return;
        }
        dbConnectionsMap.put(connection, Status.isAvailable);
    } 

}