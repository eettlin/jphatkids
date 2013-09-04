package pkids;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class Tile extends GContainer {

	public Tile(Image imageNone, Image imageHover) {
		// TODO Auto-generated constructor stub
		setSize(92, 96);
		this.setBackgroundColor(Color.gray);

		GSprite bi = new GSprite(imageNone);
		GSprite hi = new GSprite(imageHover);
//		setBackgroundSprite(bi);
		
		GButton button = new GButton();
		button.setStateSprite(ButtonState.NONE, bi);
		button.setStateSprite(ButtonState.HOVERED, hi);
		add(button);
		button.setAnchorTopLeft();
	}

}
