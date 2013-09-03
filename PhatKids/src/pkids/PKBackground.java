package pkids;

import pkids.PhatKids;
import jgame.GSprite;
import jgame.ImageCache;

public class PKBackground extends GSprite {

		public PKBackground() {
			super(ImageCache.forClass(PhatKids.class).get("paddle.png"));
		}
	}


