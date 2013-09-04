package pkids;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class Tile extends GContainer {
	public Tile() {
		// TODO Auto-generated constructor stub
		setSize(90, 94);
		this.setBackgroundColor(Color.WHITE);
		
		/*BufferedImage bg = ImageCache.forClass(PhatKids.class).get("tile.png");
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);*/
	}

}
