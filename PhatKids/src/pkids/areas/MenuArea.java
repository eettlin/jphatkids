package pkids.areas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import pkids.PhatKids;
import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {

	public MenuArea() {
		setSize(500, 100);
		this.setBackgroundColor(Color.BLACK);

		BufferedImage bg = ImageCache.forClass(PhatKids.class).get(
				"areas/menubg.png");

		// set enemies
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		for (int i = 0; i < 5; i++) {
			setTile(i);
		}

	}

	List<Image> tileImages = ImageCache.forClass(PhatKids.class).getSequential(
			"tiles/t", 1, 5, ".png"); // ***************

	private void setTile(int i) {

		// TODO Auto-generated method stub
		// String[] menuIcons = {"miOne.png", "miTwo.png", "miThree.png",
		// "miFour.png", "miFive.png"};
		Tile tile = new Tile(new IndexedTurretRecipe(i), tileImages.get(i)); // ***************
		tile.setAnchorTopLeft();
		//tile.setLocation(i * 98 + 7, 5);
		tile.setScale(1.05);
		addAtCenter(tile);
		tile.setX(i * 98);

	}

}
