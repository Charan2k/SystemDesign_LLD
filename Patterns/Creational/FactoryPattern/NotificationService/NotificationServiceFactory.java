package Patterns.Creational.FactoryPattern.NotificationService;

import Patterns.Creational.FactoryPattern.NotificationService.services.EmailNotificationService;
import Patterns.Creational.FactoryPattern.NotificationService.services.NoOpNotificationService;
import Patterns.Creational.FactoryPattern.NotificationService.services.NotificationService;
import Patterns.Creational.FactoryPattern.NotificationService.services.PushNotificationService;
import Patterns.Creational.FactoryPattern.NotificationService.services.SMSNotificationService;

class NotificationServiceFactory {
    public static NotificationService getNotificationService(NotificationType type) {
        if(type == NotificationType.EMAIL) {
            return new EmailNotificationService();
        }
        else if(type == NotificationType.SMS) {
            return new SMSNotificationService();
        }
        else if (type == NotificationType.PUSH) {
            return new PushNotificationService();
        }
        else return new NoOpNotificationService();
    }
}