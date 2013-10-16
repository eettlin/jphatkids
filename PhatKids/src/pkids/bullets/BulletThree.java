package pkids.bullets;

import pkids.PhatKids;
import jgame.ImageCache;
import jgame.controller.ConstantRotationController;

public class BulletThree extends Bullet {

	public BulletThree() {
		super(ImageCache.getImage("bullets/b3.png"),30);
		addController(new ConstantRotationController(5));
	}
	

}
