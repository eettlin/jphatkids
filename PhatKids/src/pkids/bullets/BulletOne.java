package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;

public class BulletOne extends Bullet {

	public BulletOne() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b1.png"), 10);
	}
	

}
