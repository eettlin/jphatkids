package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletThree;
import jgame.ImageCache;

public class TurretThree extends Turret {

	@Override
	public int getFireCoolDown() {
		return 300;
	}

	@Override
	public double getFireRange() {
		// TODO Auto-generated method stub
		return 250;
	}

	public TurretThree() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt3.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 100  ;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		return new BulletThree();
	}

}
