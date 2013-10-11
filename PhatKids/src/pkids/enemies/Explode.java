package pkids.enemies;

import pkids.PhatKids;
import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.SoundManager;
import jgame.listener.DelayListener;

public class Explode extends GSprite {
	public Explode() {
		super(ImageCache.getSequentialImages("enemies/explode/explode", 1, 3, ".png"));
		// After one play remove izelf after three frames
		DelayListener dl = new DelayListener(3) {

			@Override
			public void invoke(GObject target, Context context) {
				// target.removeSelf();
				removeSelf(); // same in this case
			}
		};
		addListener(dl);
		SoundManager.forClass(PhatKids.class).play("ouch.wav");
	}
}
