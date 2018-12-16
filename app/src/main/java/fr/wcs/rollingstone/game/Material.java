package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

public class Material {
    private Bitmap bitmap;
    private Rect src;

    private int width;
    private int height;

    private Paint paint;

    public Material(int x, int y, int row, int columns, Bitmap bitmap) {
        this.width = bitmap.getWidth() / columns;
        this.height = bitmap.getHeight() / row;
        this.src = new Rect(
                x * this.width,
                y * this.height,
                (x + 1) * this.width,
                (y + 1) * this.height
        );
        this.bitmap = bitmap;
        this.paint = new Paint();
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
        canvas.drawBitmap(this.bitmap, this.src, dest, paint);
    }
}
