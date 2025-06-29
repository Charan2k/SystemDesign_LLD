package Patterns.Creational.SingletonPattern.LoggerService;

import java.time.LocalDateTime;

public class Logger {
    
    private Logger() {

    }

    private static class Holder {
        private static Logger instance = new Logger();
    }

    public static Logger getInstance() {
        return Holder.instance;
    }

    public void log(String message, LoggerLevel level) {
        if(level == LoggerLevel.INFO) {
            System.out.println(LocalDateTime.now() + ": [" + level + "]: " + message);
        }
        else if(level == LoggerLevel.DEBUG) {
            System.out.println(LocalDateTime.now() + ": [" + level + "]: " + message);
        }
        else {
            System.out.println(LocalDateTime.now() + ": [" + level + "]: " + message);
        }
    }


    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Something went wrong", LoggerLevel.ERROR);
    }
}