package AdapterDesignPattern;

public class MediaPlayerAdaptor implements  Mediaplayer {

    AdvanceMediaPlayer advanceMediaPlayer;
    Advancedformat advancedformat;

    public MediaPlayerAdaptor(Advancedformat advancedformat) {
        advanceMediaPlayer = new AVIPlayer();
        this.advancedformat = advancedformat;
    }

    @Override
    public void play(String fileToPlay, String formatToPlay) {
            advancedformat.setAdvancedFileToPlay(fileToPlay);
            advancedformat.setAdvancedFormatToPlay(formatToPlay);
            advanceMediaPlayer.playAdvancedFormat(advancedformat);
    }
}
