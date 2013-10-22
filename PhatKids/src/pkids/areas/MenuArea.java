package pkids.areas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;
import pkids.Bank;
import pkids.PhatKids;
import pkids.PhatKidsGameView;

public class MenuArea extends GContainer {

	//private Bank gameBank = new Bank();
	
	public MenuArea(int bankValue) {
		
		findGameBank().setCurrentValue(bankValue);
			
		this.setBackgroundColor(Color.RED);

		BufferedImage bg = ImageCache.forClass(PhatKids.class).get(
				"areas/menubg.png");
		// set enemies
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		for (int i = 0; i < 5; i++) {
			setTile(i);
		}

	}

	private Bank findGameBank() {
		
		return getFirstAncestorOf(PhatKidsGameView.class).getGameBank();
	}

	List<Image> tileImages = ImageCache.forClass(PhatKids.class).getSequential(
			"tiles/t", 1, 5, ".png"); // ***************

	private void setTile(int i) {
		Tile tile = new Tile(new IndexedTurretRecipe(i, findGameBank(), 100), tileImages.get(i)); // ***************
		tile.setAnchorTopLeft();
		tile.setScale(1.05);
		addAtCenter(tile);
		tile.setX(i * 98);

	}

}
