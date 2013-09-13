package pkids;

import jgame.ImageCache;

public class TurretTwo extends Turret {

	public TurretTwo() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt2.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public Bullet createBullet() {
		// TODO Auto-generated method stub
		
		return new BulletTwo();
	}

}
