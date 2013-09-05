package pkids;

import java.awt.Color;
import java.awt.Image;

import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.listener.ButtonListener;

public class Tile extends GContainer {

	TurretRecipe tr;
	
	public Tile(TurretRecipe recipe,  GButton button) {
		this.tr = recipe;
		
		
		// TODO Auto-generated constructor stub
		setSize(92, 96);
		this.setBackgroundColor(Color.gray);

//		setBackgroundSprite(bi);
		
//		GButton button = new GButton();
		button.addListener(new ButtonListener() {

			@Override
			public void mouseClicked(Context context) {
				// TODO Auto-generated method stub
//				Turret turret = new TurretOne(ImageCache.forClass(PhatKids.class).get("enemy1.png"));
				Turret turret = tr.createTurret();				//  ???????????????????????????????????????????????????????????
				//getting the first occur of PKGV in the family line  Call initTurret()
				getFirstAncestorOf(PhatKidsGameView.class).initializeTurret(turret);
			}
			
			
		});
		
		add(button);
		button.setAnchorTopLeft();
		
		
	}

}
