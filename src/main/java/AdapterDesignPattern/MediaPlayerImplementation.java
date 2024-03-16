package AdapterDesignPattern;

public class MediaPlayerImplementation implements Mediaplayer{

    MediaPlayerAdaptor mediaPlayerAdaptor;
    Mediaplayer mediaplayer;
    @Override
    public void play(String fileToPlay, String formatToPlay) {
    if(formatToPlay.equals("Mp3")){
         mediaplayer = new DefaultMediaPlayer();
        mediaplayer.play(fileToPlay, formatToPlay);
    }else{
        Advancedformat advancedformat = new Advancedformat();
        advancedformat.setResolution("1080p");
        mediaPlayerAdaptor = new MediaPlayerAdaptor(advancedformat);
        mediaPlayerAdaptor.play(fileToPlay,formatToPlay);
    }
    }
}
