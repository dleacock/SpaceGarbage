package leacock.spacegarbage.framework;

/*
    Creates instances of required game objects.  Initializes frameBuffers and window.
    Contains getters for input, which screen is active, start screen and graphics info.
 */

public interface Game {
    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public Audio getAudio();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getStartScreen();
}