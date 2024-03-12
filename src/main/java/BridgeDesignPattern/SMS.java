package BridgeDesignPattern;

public class SMS implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending a notification through SMS");
    }
}
