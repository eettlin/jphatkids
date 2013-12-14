package pkids.areas;

import java.awt.Color;
import java.awt.Image;
import java.util.List;

import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;

public class ToolArea extends GContainer {
	public ToolArea() {
		setSize(100, 600);
		this.setBackgroundColor(Color.green);

		GSprite bgs = ImageCache.getSprite("areas/toolarea.png");
		bgs.setAnchorCenter();
		addAtCenter(bgs);

		List <Image> bulletImages = ImageCache.getSequentialImages( "bullets/b", 1, 5,".png"); 
		GSprite[] veggieArray = new GSprite[bulletImages.size()];
		for (int i = 0; i < veggieArray.length; i++) {
			veggieArray[i] = new GSprite(bulletImages.get(i));
		}
		
		for (int i = 0; i < 5; i++) {
			GSprite veggieSprite = ImageCache.getSprite("buttons/yellow2.png");
			veggieSprite.setAnchorTopLeft();
			addAt(veggieSprite, 15, 115*i+15);
			veggieArray[i].setScale(1.9);
			if(i == 0 || i == 1){veggieArray[i].setRotation(-90);}
			addAt(veggieArray[i], 50, 115*i+75);
			
		}

	}

}
