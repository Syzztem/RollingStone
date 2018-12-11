package fr.wcs.rollingstone.game;

public class Wall extends GameObject {

    public Wall(int x, int y, GameView gameView) {
        super(false, x, y, null, gameView);
    }
}
