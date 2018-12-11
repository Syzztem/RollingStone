package fr.wcs.rollingstone.game;

public class Wall extends GameObject {

    public Wall(int x, int y, Material material, GameView gameView) {
        super(false, x, y, material, gameView);
    }
}
