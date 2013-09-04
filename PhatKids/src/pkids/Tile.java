package pkids;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.ButtonListener;

public class Tile extends GContainer {

	TurretRecipe tr;
	public Tile(TurretRecipe recipe, Image imageNone, Image imageHover) {
		this.tr = recipe;
		
		
		// TODO Auto-generated constructor stub
		setSize(92, 96);
		this.setBackgroundColor(Color.gray);

		GSprite bi = new GSprite(imageNone);
		GSprite hi = new GSprite(imageHover);
//		setBackgroundSprite(bi);
		
		GButton button = new GButton();
		button.addListener(new ButtonListener() {

			@Override
			public void mouseClicked(Context context) {
				// TODO Auto-generated method stub
//				Turret turret = new TurretOne(ImageCache.forClass(PhatKids.class).get("enemy1.png"));
				Turret turret = tr.createTurret();
				//getting the first occur of PKGV in the family line  Call initTurret()
				getFirstAncestorOf(PhatKidsGameView.class).initializeTurret(turret);
			}
			
			
		});
		button.setStateSprite(ButtonState.NONE, bi);
		button.setStateSprite(ButtonState.HOVERED, hi);
		add(button);
		button.setAnchorTopLeft();
		
		
	}

}
