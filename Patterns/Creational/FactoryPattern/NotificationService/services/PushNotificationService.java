package Patterns.Creational.FactoryPattern.NotificationService.services;

public class PushNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Message: " + message);
        System.out.println("Sent via Push.");
    }
}