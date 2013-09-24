package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;

public class BulletFour extends Bullet {

	public BulletFour() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b4.png"), 4);
	}
	

}
