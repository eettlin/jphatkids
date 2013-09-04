package pkids;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class MenuArea extends GContainer {
	
	
	
	public MenuArea() {
		// TODO Auto-generated constructor stub
		setSize(500, 100);
		this.setBackgroundColor(Color.BLACK);
		
		BufferedImage bg = ImageCache.forClass(PhatKids.class).get("menubg.png");
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);
		
		for(int i = 0; i<5; i++){
			setTile(i);
			
		}
		
	}

	private void setTile(int i) {
		// TODO Auto-generated method stub
		Tile tile = new Tile();
		tile.setAnchorTopLeft();
		tile.setLocation(i*95+5, 600);
		this.add(tile);
		
		System.out.println(tile.getX() + "		" + tile.getY());
	}
	
	

}
