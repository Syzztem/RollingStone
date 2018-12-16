package fr.wcs.rollingstone.game;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GameObject implements  Sprite {
    private GameView gameView;

    private Material material;
    private boolean touchable;

    private Rect dest;

    private int x,y;
    private int width, height;

    public GameObject(boolean touchable, int x, int y, int width, int height, Material material, GameView gameView) {
        this.touchable = touchable;
        this.gameView = gameView;
        this.material = material;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dest = new Rect();
    }

    public boolean isTouchable() {
        return touchable;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void onDraw(Canvas canvas) {
        // draw Bitmap

        int destWidth, destHeight;

        if (canvas.getHeight() > canvas.getWidth())
            destWidth = destHeight = canvas.getWidth() / this.width;
        else
            destHeight = destWidth = canvas.getHeight() / this.height;

        this.dest.left = this.x * destWidth;
        this.dest.top = this.y * destWidth;
        this.dest.right = (this.x + 1) * destWidth;
        this.dest.bottom = (this.y + 1) * destHeight;
        material.draw(canvas, this.dest);
    }
}
