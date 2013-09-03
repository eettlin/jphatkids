package pkids;

import java.awt.Image;
import jgame.GSprite;



public abstract class Enemy extends GSprite {

	public Enemy(Image image) {
		super(image);
	}

	/**
	 * Gets the slowness (the time spent between waypoints) of this enemy.
	 * 
	 * @return the slowness
	 */
	public abstract double getSlowness();

}
