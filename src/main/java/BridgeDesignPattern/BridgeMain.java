package BridgeDesignPattern;

public class BridgeMain {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage(new Email());
        textMessage.notificationType();

        System.out.println();
        QrCode qrCode = new QrCode(new Whatsapp());
        qrCode.notificationType();

        System.out.println();
        TextMessage textMessage1 = new TextMessage(new SMS());
        textMessage1.notificationType();
    }
}
