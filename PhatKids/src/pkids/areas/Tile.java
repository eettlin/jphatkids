package pkids.areas;

import java.awt.Color;
import java.awt.Image;

import pkids.PhatKids;
import pkids.PhatKidsGameView;
import pkids.turrets.Turret;
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

		GButton buttonIcon = new GButton();

		GSprite sNone = new GSprite(iNone);
		GSprite sHover = new GSprite(iHover);
		GSprite sPressed = new GSprite(iPressed);

		buttonIcon.setStateSprite(ButtonState.NONE, sNone);
		buttonIcon.setStateSprite(ButtonState.HOVERED, sHover);
		buttonIcon.setStateSprite(ButtonState.PRESSED, sPressed);

		GSprite sIcon = new GSprite(image);
		buttonIcon.setSize(95, 90);
//		tile.addAt(sIcon, 95 / 2, 45);
		sIcon.setScale(0.8);
		buttonIcon.addAtCenter(sIcon);

		// setBackgroundSprite(bi);

		//GButton button = new GButton();
		buttonIcon.addListener(new ButtonListener() {

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

		add(buttonIcon);
		buttonIcon.setAnchorTopLeft();

	}

}
