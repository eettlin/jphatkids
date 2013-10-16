package pkids;

import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.Interpolation;
import jgame.controller.MovementTween;
import jgame.controller.ScaleTween;

public class HeroKid extends GSprite{

	public HeroKid() {
		super(ImageCache.getSequentialImages("herokid/phatkid", 1, 30,
				".png"));
		
		ScaleTween st = new ScaleTween(75, 1.5, .25);
		MovementTween mt = new MovementTween(80, Interpolation.EASE_IN,  350, 0);
		addController(st);
		addController(mt);

	}

}
