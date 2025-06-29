package Patterns.Creational.FactoryPattern.NotificationService.services;

import Patterns.Creational.SingletonPattern.LoggerService.Logger;
import Patterns.Creational.SingletonPattern.LoggerService.LoggerLevel;

public class NoOpNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        Logger logger = Logger.getInstance();
        logger.log("Notification won't be sent. You are currently in Dev environment.", LoggerLevel.INFO);
    }
}