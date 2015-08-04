package leacock.spacegarbage.framework;

public abstract class Screen {

    // Screen has a game
    protected final Game game;
    // Constructor for screen
    public Screen(Game game) {
        this.game = game;
    }

    // All screens can update, present, pause, resume and dipose. Not all may do so.
    public abstract void update(float deltaTime);
    public abstract void present(float deltaTime);
    public abstract void pause();
    public abstract void resume();
    public abstract void dispose();

}
