package leacock.mrnom;

import java.util.List;

import leacock.mrnom.framework.Game;
import leacock.mrnom.framework.Graphics;
import leacock.mrnom.framework.Input.TouchEvent;
import leacock.mrnom.framework.Screen;

public class HelpScreen3 extends Screen {
    public HelpScreen3(Game game){
        super(game);
    }

    public void update(float deltaTime) {

        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        game.getInput().getKeyEvents();

        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {
                if (event.x > 256 && event.y > 416) {
                    game.setScreen(new MainMenuScreen(game));
                    if (Settings.soundEnabled)
                        Assets.click.play(1);
                    return;
                }
            }
        }
    }

    public void present(float deltaTime){
        Graphics g = game.getGraphics();
        g.drawPixmap(Assets.background, 0 , 0);
        g.drawPixmap(Assets.help3, 64, 100);
        g.drawPixmap(Assets.buttons, 256, 416, 0, 64, 64, 64);

    }

    public void pause(){}

    public void resume(){}

    public void dispose(){}



}
