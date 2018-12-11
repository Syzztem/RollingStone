package fr.wcs.rollingstone.game;

import android.graphics.Canvas;
import android.graphics.Rect;

public abstract class GameObject implements  Sprite {
    private GameView gameView;

    private Material material;
    private boolean touchable;

    private Rect dest;

    public GameObject(boolean touchable, int x, int y, Material material, GameView gameView) {
        this.touchable = touchable;
        this.gameView = gameView;
        this.material = material;
        this.dest = new Rect(x, y, x + this.material.getWidth(), y + this.material.getHeight());
    }

    public boolean isTouchable() {
        return touchable;
    }

    @Override
    public void onDraw(Canvas canvas) {
        // draw Bitmap
        material.draw(canvas, this.dest);
    }
}
