package fr.wcs.rollingstone.game;

import android.graphics.Canvas;

public class Player extends GameObject {

    public Player(boolean touchable, int x, int y, GameView gameView) {
        super(touchable, x, y, null, gameView);
    }

    @Override
    public void onDraw(Canvas canvas) {

    }
}
