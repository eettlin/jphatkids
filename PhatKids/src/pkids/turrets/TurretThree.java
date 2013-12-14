package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletThree;
import jgame.ImageCache;

public class TurretThree extends Turret {
	
	public TurretThree() {
		super(ImageCache.getImage("turrets/tt3.png"));;
	}
	
	
	@Override
	public int getFireCoolDown() {
		return 30;
	}

	@Override
	public double getFireRange() {
		// TODO Auto-generated method stub
		return 250;
	}

	

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 30  ;
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
	@Override
	public int getTurretValue() {
		return 300;
	}

}
