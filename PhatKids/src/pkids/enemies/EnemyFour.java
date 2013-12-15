package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyFour extends Enemy {

private double slownes = 5;

public EnemyFour() {
	super(ImageCache.getImage("enemies/enemy4.png"), 400, 120);
}
	@Override
	public double getSlowness() {
		return 2;
	}
	
	public  void setSlowness(int s) {
		slownes = s;
	}


}
