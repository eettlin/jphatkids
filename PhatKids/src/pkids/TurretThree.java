package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretThree extends Turret {

	public TurretThree() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt3.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getBulletImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBulletDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
