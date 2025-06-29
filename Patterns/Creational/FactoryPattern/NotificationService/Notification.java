package Patterns.Creational.FactoryPattern.NotificationService;

import Patterns.Creational.FactoryPattern.NotificationService.services.NotificationService;

public class Notification {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationServiceFactory.getNotificationService(NotificationType.SMS);
        notificationService.sendNotification("Charan says Hi!!");
    }
}
