package pkids.bullets;

import jgame.ImageCache;
import pkids.PhatKids;

public class BulletTwo extends Bullet {

	public BulletTwo() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b2.png"), 20);
	}
	

}
