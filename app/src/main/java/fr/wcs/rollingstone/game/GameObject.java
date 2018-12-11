package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public abstract class GameObject implements  Sprite{
    private boolean touchable;
    private Bitmap  bitmap;

    public GameObject(boolean touchable, Bitmap bitmap) {
        this.touchable = touchable;
        this.bitmap = bitmap;
    }

    public boolean isTouchable() {
        return touchable;
    }
}
