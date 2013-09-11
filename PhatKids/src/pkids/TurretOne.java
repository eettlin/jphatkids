package pkids;

import java.awt.Image;

import jgame.Context;
import jgame.GObject;
import jgame.ImageCache;
import jgame.listener.FrameListener;

public class TurretOne extends Turret {

	public TurretOne() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt1.png"));
		
	
	}

	@Override
	public int getFireDelay() {
		return 30;
	}

	@Override
	public double getBulletSpeed() {
		return 2;
	}

	@Override
	public Bullet createBullet() {
		return null;
	}

	@Override
	public Image getBulletImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBulletDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
