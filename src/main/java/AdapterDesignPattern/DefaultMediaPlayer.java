package AdapterDesignPattern;

public class DefaultMediaPlayer implements Mediaplayer{
    @Override
    public void play(String fileToPlay, String formatToPlay) {
        System.out.println("Playing song with Default media player " + fileToPlay+ "." +formatToPlay);
    }
}
