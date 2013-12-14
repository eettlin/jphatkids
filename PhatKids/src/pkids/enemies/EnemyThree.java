package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyThree extends Enemy {

	public EnemyThree() {
		
		//ImageCache.forClass(PhatKids.class   This code gets the cache for a particular class; the cache is an instance of ImageCache
		super(ImageCache.getImage("enemies/enemy3.png"), 200, 90);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 6;
	}

}
