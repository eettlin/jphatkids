package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretOne extends Turret {

	public TurretOne() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt1.png"));
	}

}
