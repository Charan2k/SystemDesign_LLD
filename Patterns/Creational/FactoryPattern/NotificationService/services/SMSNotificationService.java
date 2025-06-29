package Patterns.Creational.FactoryPattern.NotificationService.services;

public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Message: " + message);
        System.out.println("Sent via SMS.");
    }
}