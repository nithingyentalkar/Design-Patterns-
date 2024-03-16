package AdapterDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        Mediaplayer mediaplayer  = new MediaPlayerImplementation();
        mediaplayer.play("The Search by NF", "Mp3");

        System.out.println("------------------------------------------------------------------");

        mediaplayer.play("The Search By NF", "Mp4");

    }
}
