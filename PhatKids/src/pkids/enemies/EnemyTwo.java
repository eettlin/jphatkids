package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyTwo extends Enemy {

	public EnemyTwo() {
		
		//ImageCache.forClass(PhatKids.class   This code gets the cache for a particular class; the cache is an instance of ImageCache
		super(ImageCache.getImage("enemies/enemy2.png"), 250, 80);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 4;
	}

}
