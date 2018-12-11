package fr.wcs.rollingstone.game;

import android.graphics.Canvas;

public class Finish extends GameObject {
    public Finish(int x, int y, GameView gameView) {
        super(true, x, y, null, gameView);
    }

    @Override
    public void onDraw(Canvas canvas) {

    }
}
