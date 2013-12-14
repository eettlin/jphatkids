package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletOne;
import jgame.ImageCache;

public class TurretOne extends Turret {

	public TurretOne() {
		super(ImageCache.getImage("turrets/tt1.png"));
		
		
	
	}

	@Override
	public int getFireDelay() {
		return 20;
	}

	@Override
	public int getFireCoolDown() {
		return 90;
	}

	

	@Override
	public double getBulletSpeed() {
		return 1;
	}

	@Override
	public double getFireRange() {
		return 200;
	}

	@Override
	public Bullet createBullet() {
		return new BulletOne();
	}

	@Override
	public int getTurretValue() {
		return 100;
	}

}
