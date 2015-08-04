package leacock.mrnom;

import leacock.mrnom.framework.Screen;
import leacock.mrnom.framework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {

    public Screen getStartScreen(){
        return new LoadingScreen(this);
    }
}
