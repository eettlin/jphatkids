package pkids;

import java.awt.Color;
import java.awt.Image;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class Tile extends GContainer {

	TurretRecipe tr;

	public Tile(TurretRecipe recipe, Image image) {
		this.tr = recipe;

		// TODO Auto-generated constructor stub
		setSize(92, 96);
		this.setBackgroundColor(Color.gray);

		ImageCache cache = ImageCache.forClass(PhatKids.class);
		Image iNone = cache.get("tiles/tile_none.png");
		Image iHover = cache.get("tiles/tile_hover.png");
		Image iPressed = cache.get("tiles/tile_pressed.png");

		GButton tile = new GButton();

		GSprite sNone = new GSprite(iNone);
		GSprite sHover = new GSprite(iHover);
		GSprite sPressed = new GSprite(iPressed);

		tile.setStateSprite(ButtonState.NONE, sNone);
		tile.setStateSprite(ButtonState.HOVERED, sHover);
		tile.setStateSprite(ButtonState.PRESSED, sPressed);

		GSprite sIcon = new GSprite(image);
		tile.setSize(95, 90);
//		tile.addAt(sIcon, 95 / 2, 45);
		tile.addAtCenter(sIcon);

		// setBackgroundSprite(bi);

		// GButton button = new GButton();
		tile.addListener(new ButtonListener() {

			@Override
			public void mouseClicked(Context context) {
				// TODO Auto-generated method stub
				// Turret turret = new
				// TurretOne(ImageCache.forClass(PhatKids.class).get("enemy1.png"));
				Turret turret = tr.createTurret(); // ???????????????????????????????????????????????????????????
				// getting the first occur of PKGV in the family line Call
				// initTurret()
				getFirstAncestorOf(PhatKidsGameView.class).initializeTurret(
						turret);
			}

		});

		add(tile);
		tile.setAnchorTopLeft();

	}

}
