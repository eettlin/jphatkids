package pkids;

import jgame.ImageCache;

public class TurretFive extends Turret {

	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt5.png"));
	}

	@Override
	public int getFireDelay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
