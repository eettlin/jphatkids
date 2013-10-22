package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletFour;
import jgame.ImageCache;

public class TurretFour extends Turret {

	@Override
	public int getFireCoolDown() {
		return 200;
	}

	public TurretFour() {
		super(ImageCache.getImage("turrets/tt4.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double getFireRange() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return new BulletFour();
	}

}
