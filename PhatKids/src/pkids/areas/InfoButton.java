package pkids.areas;

import java.awt.Image;

import jgame.GButton;
import jgame.GSprite;

public class InfoButton extends GButton {
	Image image;
	public InfoButton(Image image) {
		super();
		this.image = image;
		GSprite gs = new GSprite(image);
		gs.setAnchorTopLeft();
		gs.setScale(.75);
		addAt(gs, 9, 5);
		
	}
}
