package BridgeDesignPattern;

public class Whatsapp implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending a notification on Whatsapp");
    }
}
