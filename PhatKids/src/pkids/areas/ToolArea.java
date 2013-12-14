package pkids.areas;

import java.awt.Color;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class ToolArea extends GContainer {
	public ToolArea() {
		setSize(100, 600);
		this.setBackgroundColor(Color.green);
		
		GSprite bgs = ImageCache.getSprite("areas/toolarea.png");
		bgs.setAnchorCenter();
		addAtCenter(bgs);

	}

}
