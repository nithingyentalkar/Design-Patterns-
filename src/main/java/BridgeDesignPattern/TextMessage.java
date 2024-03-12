package BridgeDesignPattern;

public class TextMessage extends NotificationType {

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is a Text message" );
    }

    @Override
    public void notificationType() {
        notificationSender.sendNotification();
    }
}
