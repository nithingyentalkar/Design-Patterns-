package BridgeDesignPattern;

public class Email  implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending a notification on Email");
    }
}
