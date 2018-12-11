package fr.wcs.rollingstone.game;


public class Player extends GameObject {

    public Player(boolean touchable, int x, int y, GameView gameView) {
        super(touchable, x, y, null, gameView);
    }
}
