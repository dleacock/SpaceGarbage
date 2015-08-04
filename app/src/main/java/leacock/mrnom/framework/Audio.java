package leacock.mrnom.framework;

/*
    Audio class creates instances of Music and Sound classes.
    Creates AssetFileDescription then passes to Music/Sound

 */


public interface Audio {
    public Music newMusic(String filename);

    public Sound newSound(String filename);
}
