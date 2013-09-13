package pkids;

import jgame.ImageCache;
import jgame.controller.ConstantRotationController;

public class BulletThree extends Bullet {

	public BulletThree() {
		super(ImageCache.forClass(PhatKids.class).get("bullets/b3.png"), 10);
		addController(new ConstantRotationController(5));
	}
	

}
