package BridgeDesignPattern;

public abstract class NotificationType {

    NotificationSender notificationSender;

    public NotificationType(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public abstract void notificationType();
}
