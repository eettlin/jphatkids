package pkids;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class Tile extends GContainer {

	public Tile(String iconName) {
		// TODO Auto-generated constructor stub
		setSize(92, 96);
		this.setBackgroundColor(Color.gray);

		BufferedImage bg = ImageCache.forClass(PhatKids.class).get(iconName);
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);
	}

}
