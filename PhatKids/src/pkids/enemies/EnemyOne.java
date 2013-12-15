package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyOne extends Enemy {

	public EnemyOne() {
		  
		//ImageCache.forClass(PhatKids.class   This code gets the cache for a particular class; the cache is an instance of ImageCache
		super(ImageCache.getImage("enemies/enemy1.png"),200, 50);
	}

	@Override
	public double getSlowness() {
		return 2;
	}

}
