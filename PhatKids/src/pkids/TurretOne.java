package pkids;

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
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public double getBulletSpeed() {
		// TODO Auto-generated method stub
		return 2;
	}

}
