package pkids.bullets;

import jgame.ImageCache;
import jgame.controller.ConstantRotationController;
import pkids.PhatKids;

public class BulletFive extends Bullet {

	public BulletFive() {
		//super(ImageCache.forClass(PhatKids.class).get("bullets/b5.png"), 50);
		super(ImageCache.getImage("bullets/b5.png"), 50);
		addController(new ConstantRotationController(5));
	}

}
