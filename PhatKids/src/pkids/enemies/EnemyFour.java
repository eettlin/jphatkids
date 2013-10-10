package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyFour extends Enemy {
public EnemyFour() {
	// TODO Auto-generated constructor stub
	super(ImageCache.getImage("enemies/enemy4.png"), 300);
}
	@Override
	public double getSlowness() {
		return 4;
	}

}
