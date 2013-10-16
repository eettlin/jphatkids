package pkids;

import jgame.GSprite;
import jgame.ImageCache;

public class HeroKid extends GSprite{

	public HeroKid() {
		super(ImageCache.getSequentialImages("enemies/explode/explode", 1, 3,
				".png"));

	}

}
