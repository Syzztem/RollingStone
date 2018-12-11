package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Material {
    private Bitmap bitmap;
    private Rect src;

    private int width;
    private int height;

    public Material(int x, int y, int row, int columns, Bitmap bitmap) {
        this.width = bitmap.getWidth() / columns;
        this.height = bitmap.getHeight() / row;
        x = x * this.width;
        y = y * this.height;
        this.src = new Rect(x, y, x + this.width, y + this.height);
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public Rect getSrc() {
        return src;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void draw(Canvas canvas, Rect dest) {
        canvas.drawBitmap(this.bitmap, this.src, dest, null);
    }
}
