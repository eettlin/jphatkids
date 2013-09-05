package pkids;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import jgame.ButtonState;
import jgame.GButton;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {

	public MenuArea() {
		setSize(500, 100);
		this.setBackgroundColor(Color.RED);

		BufferedImage bg = ImageCache.forClass(PhatKids.class)
				.get("menubg.png");
		
		// set enemies
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		for (int i = 0; i < 5; i++) {
			setTile(i);
		}

	}

	private void setTile(int i) {
		
		
		List<Image> imagesNone = ImageCache.forClass(PhatKids.class).getSequential("mi", 1, 5, ".png"); //  ***************
		List<Image> imagesHover = ImageCache.forClass(PhatKids.class).getSequential("mi", 1, 5, ".png"); //  ***************
		List<Image> imagesPressed = ImageCache.forClass(PhatKids.class).getSequential("mi", 1, 5, ".png"); //  ***************
		//set button
		GButton tb = new GButton();
		tb.setStateSprite(ButtonState.NONE, new GSprite(imagesNone.get(i)));
		tb.setStateSprite(ButtonState.HOVERED, new GSprite(imagesHover.get(i)));
		tb.setStateSprite(ButtonState.PRESSED, new GSprite(imagesPressed.get(i)));
		
		// TODO Auto-generated method stub
//		String[] menuIcons = {"miOne.png", "miTwo.png", "miThree.png", "miFour.png", "miFive.png"};
		Tile tile = new Tile(new IndexedTurretRecipe(i), tb);           //  ***************
		tile.setAnchorTopLeft();
		tile.setLocation(i * 98 + 7, 5);
		add(tile);


	}

}
