package fr.wcs.rollingstone;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;

import fr.wcs.rollingstone.game.GameView;
import fr.wcs.rollingstone.game.Labyrinth;
import fr.wcs.rollingstone.game.MaterialFactory;
import fr.wcs.rollingstone.game.Wall;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;
    private ConstraintLayout lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lLayout = findViewById(R.id.mainConstraint);

        gameView = new GameView(this);

        gameView.setId(R.id.game_view);
        lLayout.addView(gameView,0);

        // Get constraint tool
        ConstraintSet set = new ConstraintSet();
        set.clone(lLayout);

        // Set constraints
        set.connect(gameView.getId(), ConstraintSet.TOP, lLayout.getId(), ConstraintSet.TOP, 0);
        set.connect(gameView.getId(), ConstraintSet.BOTTOM, lLayout.getId(), ConstraintSet.BOTTOM, 0);
        set.connect(gameView.getId(), ConstraintSet.LEFT, lLayout.getId(), ConstraintSet.LEFT, 0);
        set.connect(gameView.getId(), ConstraintSet.RIGHT, lLayout.getId(), ConstraintSet.RIGHT, 0);
        set.applyTo(lLayout);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Labyrinth labyrinth = new Labyrinth();

        Bitmap tiles = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.raw.tiles);
        MaterialFactory materialFactory = new MaterialFactory(tiles);

        String labyrinthStr = labyrinth.getLabyrinth();
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        for(int y = 0; y < 10; y ++) {
            for(int x = 0; x < 10; x++) {
                int posX = x * size.x / 10;
                int posY = y * size.y / 10;
                switch (labyrinthStr.charAt(y * 10 + x)) {
                    case '#' : gameView.getSprites().add(new Wall(posX, posY, materialFactory.getWall(), gameView)); break;
                    default:
                }
            }
        }
    }
}
