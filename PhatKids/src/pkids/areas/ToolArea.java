package pkids.areas;

import java.awt.Color;
import java.awt.Image;
import java.util.List;

import pkids.PhatKids;


import jgame.ButtonState;
import jgame.GButton;
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

		//Get veggie icons to place on button tiles
		List<Image> bulletImages = ImageCache.getSequentialImages("bullets/b",
				1, 5, ".png");
		
		//create two-state button
		GSprite none_img = new GSprite(ImageCache.forClass(PhatKids.class)
				.get("buttons/infonone.png"));
		GSprite hover_img = new GSprite(ImageCache.forClass(PhatKids.class)
				.get("buttons/infohover.png"));

		for (int i = 0; i < 9; i++) {
			GButton infoButton = new GButton();
			infoButton.setStateSprite(ButtonState.NONE, none_img);
			infoButton.setStateSprite(ButtonState.HOVERED, hover_img);

			infoButton.setScale(0.75);
			
			addAt(infoButton, 25, 65 * i + 9);
		}

		/*List<Image> bulletImages = ImageCache.getSequentialImages("bullets/b",
				1, 5, ".png");
		GSprite[] veggieArray = new GSprite[bulletImages.size()];
		for (int i = 0; i < veggieArray.length; i++) {
			veggieArray[i] = new GSprite(bulletImages.get(i));
		}

		for (int i = 0; i < 9; i++) {
			GSprite veggieSprite = ImageCache.getSprite("buttons/infonone.png");
			veggieSprite.setAnchorTopLeft();
			veggieSprite.setScale(0.75);
			addAt(veggieSprite, 25, 65 * i + 9);

			veggieArray[i%5].setScale(1.2);
			if (i == 0 || i == 1) {
				veggieArray[i%5].setRotation(-90);
			}
			addAt(veggieArray[i%5], 25, 65 * i + 9);

		}*/

	}

}
