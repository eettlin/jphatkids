package pkids;

import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt5.png"));
	}

	@Override
	public int getFireDelay() {
		return 130;
	}

	@Override
	public double getBulletSpeed() {
		return 7;
	}

	@Override
	public Bullet createBullet() {
		return new BulletFive();
	}

}
