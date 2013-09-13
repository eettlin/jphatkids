package pkids;

import jgame.ImageCache;

public class TurretFour extends Turret {

	public TurretFour() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt4.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return new BulletFour();
	}

}
