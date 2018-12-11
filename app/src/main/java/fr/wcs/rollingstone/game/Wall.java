package fr.wcs.rollingstone.game;

public class Wall extends GameObject {

    public Wall(int x, int y, int width, int height, Material material, GameView gameView) {
        super(false, x, y, width, height, material, gameView);
    }
}
