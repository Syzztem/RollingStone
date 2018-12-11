package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Material {
    private Bitmap bitmap;
    private Rect src;

    private int width;
    private int height;

    public Material(int i, int j, int row, int columns, Bitmap bitmap) {
        this.width = bitmap.getWidth() / columns;
        this.height = bitmap.getHeight() / row;
        this.src = new Rect(i, j, i + this.width, j + this.height);
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
