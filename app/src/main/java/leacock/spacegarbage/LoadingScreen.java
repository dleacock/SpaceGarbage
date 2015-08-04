package leacock.spacegarbage;

import leacock.spacegarbage.framework.Game;
import leacock.spacegarbage.framework.Graphics;
import leacock.spacegarbage.framework.Screen;
import leacock.spacegarbage.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen{

    public LoadingScreen(Game game){
        super(game);
    }

    public void update(float deltaTime){

        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("backgroundSpace.png", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("titleScreen2.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("mainmenu1.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("buttons1.png", PixmapFormat.ARGB4444);
        Assets.help1 = g.newPixmap("story1.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("help11.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
        Assets.headUp = g.newPixmap("shipUP.png", PixmapFormat.ARGB4444);
        Assets.headLeft = g.newPixmap("shipLEFT.png", PixmapFormat.ARGB4444);
        Assets.headDown = g.newPixmap("shipDOWN.png", PixmapFormat.ARGB4444);
        Assets.headRight = g.newPixmap("shipRIGHT.png", PixmapFormat.ARGB4444);
        Assets.tail = g.newPixmap("powerupGreen.png", PixmapFormat.ARGB4444);
        Assets.stain1 = g.newPixmap("garbage1.png", PixmapFormat.ARGB4444);
        Assets.stain2 = g.newPixmap("garbage2.png", PixmapFormat.ARGB4444);
        Assets.stain3 = g.newPixmap("garbage3.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());
        game.setScreen(new MainMenuScreen(game));

    }

    public void present(float deltaTime){}

    public void pause(){}

    public void resume(){}

    public void dispose(){}


}
