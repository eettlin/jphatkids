package pkids;

import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.ScaleTween;

public class HeroKid extends GSprite{

	public HeroKid() {
		super(ImageCache.getSequentialImages("herokid/phatkid", 1, 30,
				".png"));
		
		ScaleTween st = new ScaleTween(30, 1.5, .25);
		addController(st);

	}

}
