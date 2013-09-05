package pkids;

import java.awt.Image;

import jgame.ImageCache;

public class TurretFour extends Turret {

	public TurretFour() {
		super(ImageCache.forClass(PhatKids.class).get("turrets/dt4.png"));
	}

}
