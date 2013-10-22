package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletTwo;
import jgame.ImageCache;

public class TurretTwo extends Turret {

	@Override
	public int getFireCoolDown() {
		return 50;
	}

	public TurretTwo() {
		super(ImageCache.getImage("turrets/tt2.png"));
	}

	@Override
	public int getFireDelay() {
		return 7;
	}

	@Override
	public double getFireRange() {
		return 450;
	}

	@Override
	public double getBulletSpeed() {
		return 5;
	}

	@Override
	public Bullet createBullet() {
		return new BulletTwo();
	}

}
