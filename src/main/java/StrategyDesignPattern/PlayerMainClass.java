package StrategyDesignPattern;

public class PlayerMainClass {
    public static void main(String[] args) {
        VideoPlayer phoneVideoPlayer = new PhoneVideoPlayer(new Phone(), new Res720());
        phoneVideoPlayer.display();

        System.out.println("---------------------------------------------------------------------");

        VideoPlayer laptopVideoPlayer = new LaptopVideoPlayer(new Laptop(), new Res4K());
        laptopVideoPlayer.display();

        System.out.println("-----------------------------------------------------------------------");

        VideoPlayer laptopVideoPlayer1 = new LaptopVideoPlayer(new Phone(), new Res720());
        laptopVideoPlayer1.display();


        System.out.println("-----------------------------------------------------------------------");

        VideoPlayer player = new PhoneVideoPlayer(new Laptop(), new Res4K());
        player.display();

    }
}
