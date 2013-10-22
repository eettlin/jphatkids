package pkids.areas;

import java.awt.Image;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;
import pkids.PhatKidsGameView;
import pkids.turrets.Turret;

public class Tile extends GButton {

	TurretRecipe tr;

	public Tile(TurretRecipe recipe, Image image) {
		this.tr = recipe;

		// TODO Auto-generated constructor stub
		setSize(92, 96);

		// ImageCache cache = ImageCache.forClass(PhatKids.class);
		// Image iNone = cache.get("tiles/tile_none.png");
		// GSprite sNone = new GSprite(iNone);
		GSprite sNone = ImageCache.getSprite("tiles/tile_none.png");
		GSprite sHover = ImageCache.getSprite("tiles/tile_hover.png");
		GSprite sPressed = ImageCache.getSprite("tiles/tile_pressed.png");

		setStateSprite(ButtonState.NONE, sNone);
		setStateSprite(ButtonState.HOVERED, sHover);
		setStateSprite(ButtonState.PRESSED, sPressed);

		GSprite sIcon = new GSprite(image);
		// tile.addAt(sIcon, 95 / 2, 45);
		sIcon.setScale(0.8);
		addAtCenter(sIcon);

		// setBackgroundSprite(bi);

		// GButton button = new GButton();
		addListener(new ButtonListener() {

			@Override
			public void mouseClicked(Context context) {
				// TODO Auto-generated method stub
				// Turret turret = new
				// TurretOne(ImageCache.forClass(PhatKids.class).get("enemy1.png"));
				Turret turret = tr.createTurret();
				// getting the first occur of PKGV in the family line Call
				// initTurret()

				getFirstAncestorOf(PhatKidsGameView.class).initializeTurret(
						turret);
			}

		});

	}

}
