package fr.wcs.rollingstone;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;

import fr.wcs.rollingstone.game.GameObject;
import fr.wcs.rollingstone.game.GameView;
import fr.wcs.rollingstone.game.Material;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout lLayout = findViewById(R.id.mainConstraint);

        GameView lView = new GameView(this);

        Bitmap img = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.raw.tiles);
        Material stone = new Material(4, 1, 2, 5, img);

        GameObject stoneObject = new GameObject(false, 100, 100, stone, lView);
        lView.getSprites().add(stoneObject);

        lView.setId(R.id.game_view);
        lLayout.addView(lView,0);

        // Get constraint tool
        ConstraintSet set = new ConstraintSet();
        set.clone(lLayout);

        // Set constraints
        set.connect(lView.getId(), ConstraintSet.TOP, lLayout.getId(), ConstraintSet.TOP, 0);
        set.connect(lView.getId(), ConstraintSet.BOTTOM, lLayout.getId(), ConstraintSet.BOTTOM, 0);
        set.connect(lView.getId(), ConstraintSet.LEFT, lLayout.getId(), ConstraintSet.LEFT, 0);
        set.connect(lView.getId(), ConstraintSet.RIGHT, lLayout.getId(), ConstraintSet.RIGHT, 0);
        set.applyTo(lLayout);
    }
}
