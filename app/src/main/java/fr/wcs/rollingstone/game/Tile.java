package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Tile implements Sprite {
    private Bitmap bitmap;
    private GameView gameView;

    private int row;
    private int column;

    private int width;
    private int heigth;

    public Tile(Bitmap bitmap, GameView gameView) {
        this.bitmap = bitmap;
        this.gameView = gameView;
        this.row = 0;
        this.column = 0;
        this.width = bitmap.getWidth() / this.row;
        this.heigth = bitmap.getHeight() / this.column;
    }

    @Override
    public void onDraw(Canvas canvas) {
        // draw Bitmap
        int srcX = 0;
        int srcY = 1 * this.heigth;
        Rect src = new Rect(srcX, srcY, srcX + this.width, srcY + this.heigth);
        Rect dest = new Rect(0, 0, this.width, this.heigth);
        canvas.drawBitmap(this.bitmap, src, dest, null);
    }
}
