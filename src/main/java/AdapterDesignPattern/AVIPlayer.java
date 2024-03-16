package AdapterDesignPattern;

public class AVIPlayer implements  AdvanceMediaPlayer{
    @Override
    public void playAdvancedFormat(Advancedformat advancedformat) {
        System.out.println("Playing video using Advanced format " + advancedformat.advancedFileToPlay + "."
                + advancedformat.advancedFormatToPlay + " in Resolution " + advancedformat.Resolution);
    }
}
