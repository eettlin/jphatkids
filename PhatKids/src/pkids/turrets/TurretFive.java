package pkids.turrets;

import jgame.ImageCache;
import pkids.bullets.Bullet;
import pkids.bullets.BulletFive;

public class TurretFive extends Turret {

	
	
	public TurretFive() {
		//super(ImageCache.forClass(PhatKids.class).get("turrets/tt5.png"));
		super(ImageCache.getImage("turrets/tt5.png"));
		
	}

	@Override
	public int getFireCoolDown() {
		return 90;
	}

	@Override
	public int getFireDelay() {
		return 5;
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
	
	@Override
	public int getTurretValue() {
		return 500;
	}

}
