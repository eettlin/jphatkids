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
				.get("areas/menubg.png");
		
		// set enemies
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		for (int i = 0; i < 4; i++) {
			setTile(i);
		}

	}

	List<Image> tileImages = ImageCache.forClass(PhatKids.class).getSequential("tiles/d", 1, 4, ".png"); //  ***************
	private void setTile(int i) {
		
		// TODO Auto-generated method stub
//		String[] menuIcons = {"miOne.png", "miTwo.png", "miThree.png", "miFour.png", "miFive.png"};
		Tile tile = new Tile(new IndexedTurretRecipe(i), tileImages.get(i));           //  ***************
		tile.setAnchorTopLeft();
		tile.setLocation(i * 98 + 7, 5);
		add(tile);


	}

}
