package BridgeDesignPattern;

public class QrCode extends NotificationType {
    public QrCode(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a QR Code message" );
    }

    @Override
    public void notificationType() {
        notificationSender.sendNotification();
    }
}
