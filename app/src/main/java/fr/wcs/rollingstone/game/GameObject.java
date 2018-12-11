package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public abstract class GameObject implements  Sprite {
    private Bitmap bitmap;
    private GameView gameView;

    private Tile tile;
    private boolean touchable;

    public GameObject(boolean touchable, Tile tile, GameView gameView) {
        this.touchable = touchable;
        this.gameView = gameView;
        this.tile = tile;
    }

    public boolean isTouchable() {
        return touchable;
    }

    @Override
    public void onDraw(Canvas canvas) {
        // draw Bitmap

        canvas.drawBitmap(this.bitmap,
                this.tile.getSrc(), this.tile.getDest(), null);
    }
}
