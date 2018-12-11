package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class Tile {
    private Bitmap bitmap;
    private Rect src;
    private Rect dest;

    private int width;
    private int height;

    public Tile(int i, int j, int row, int columns, int x, int y, Bitmap bitmap) {
        this.width = bitmap.getWidth() / row;
        this.height = bitmap.getHeight() / columns;
        this.src = new Rect(i, j, i + this.width, j + this.height);
        this.dest = new Rect(x, y, x + this.width, y + this.height);
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

    public Rect getDest() {
        return dest;
    }
}
