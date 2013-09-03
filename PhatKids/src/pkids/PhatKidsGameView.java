package pkids;

import java.awt.image.BufferedImage;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.TimerListener;

public class PhatKidsGameView extends GContainer {

	public PhatKidsGameView() {
		// Set the size.
		setSize(900, 700);
		
		// Create play area and locate on stage
		PKPlayArea pa = new PKPlayArea();
		pa.setAnchorTopLeft();
		pa.setLocation(100, 0);
		add(pa);

		
	}


}

/*
 * BufferedImage bi =
 * ImageCache.forClass(PhatKids.class).get("gameover.png");GSprite gs = new
 * GSprite(bi);setBackgroundSprite(gs);
 */
// BufferedImage bg = ImageCache.forClass(PhatKids.class).get("bg2.png");
// GSprite gs = new GSprite(bg);
// setBackgroundSprite(gs);