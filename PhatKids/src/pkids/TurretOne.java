package pkids;

import jgame.ImageCache;

public class TurretOne extends Turret {

	public TurretOne() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt1.png"));
		
	
	}

	@Override
	public int getFireDelay() {
		return 120;
	}

	@Override
	public double getBulletSpeed() {
		return 1;
	}

	@Override
	public Bullet createBullet() {
		return new BulletOne();
	}

}
