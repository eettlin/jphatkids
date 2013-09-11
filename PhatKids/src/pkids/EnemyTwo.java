package pkids;

import jgame.ImageCache;

public class EnemyTwo extends Enemy {

	public EnemyTwo() {
		
		//ImageCache.forClass(PhatKids.class   This code gets the cache for a particular class; the cache is an instance of ImageCache
		super(ImageCache.forClass(PhatKids.class).get("enemies/enemy2.png"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 8;
	}

}
