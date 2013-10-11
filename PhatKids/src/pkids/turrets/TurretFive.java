package pkids.turrets;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.bullets.BulletFive;
import jgame.Context;
import jgame.GObject;
import jgame.ImageCache;
import jgame.listener.FrameListener;

public class TurretFive extends Turret {

	
	
	public TurretFive() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/tt5.png"));
		
		
	}

	@Override
	public int getFireCoolDown() {
		return 180;
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

}
