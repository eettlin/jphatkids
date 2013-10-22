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

		setSize(92, 96);

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

		addListener(new ButtonListener() {

			@Override
			public void mouseClicked(Context context) {
				if (tr.canPurchase()) {
					Turret turret = tr.createTurret();
					tr.purchaseTurret();
					getFirstAncestorOf(PhatKidsGameView.class)
							.initializeTurret(turret);
				}
			}

		});

	}
}
