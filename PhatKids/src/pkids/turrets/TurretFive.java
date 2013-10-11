package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletFive;
import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt5.png"));
	}

	@Override
	public int getFireDelay() {
		return 3;
	}

	@Override
	public double getBulletSpeed() {
		return 2;
	}

	@Override
	public double getFireRange() {
		return 350;
	}

	@Override
	public Bullet createBullet() {
		return new BulletFive();
	}

}
