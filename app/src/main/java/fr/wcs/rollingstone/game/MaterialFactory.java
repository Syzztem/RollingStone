package fr.wcs.rollingstone.game;

import android.graphics.Bitmap;

public class MaterialFactory {

    private Bitmap bitmap;
    private Material floor;
    private Material wall;
    private Material player;
    private Material start;
    private Material end;

    public MaterialFactory(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.floor = new Material(1, 1, 2, 5, bitmap);
        this.wall = new Material(3, 1, 2, 5, bitmap);
        this.player = new Material(4, 1, 2, 5, bitmap);
        this.start = new Material(0, 0, 2, 5, bitmap);
        this.end = new Material(2, 0, 2, 5, bitmap);
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public Material getFloor() {
        return floor;
    }

    public Material getWall() {
        return wall;
    }

    public Material getPlayer() {
        return player;
    }

    public Material getStart() {
        return start;
    }

    public Material getEnd() {
        return end;
    }
}
