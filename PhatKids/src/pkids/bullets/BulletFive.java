package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;

public class BulletFive extends Bullet {

	public BulletFive() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b4.png"), 5);
	}
	
	
}
