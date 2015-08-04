package leacock.spacegarbage;

import leacock.spacegarbage.framework.Screen;
import leacock.spacegarbage.framework.impl.AndroidGame;

public class SpaceGarbageGame extends AndroidGame {

    public Screen getStartScreen(){
        return new LoadingScreen(this);
    }
}
