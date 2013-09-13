package pkids;

import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt5.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 19;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return new BulletFive();
	}

}
