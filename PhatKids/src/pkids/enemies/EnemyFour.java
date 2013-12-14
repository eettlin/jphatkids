package pkids.enemies;

import pkids.PhatKids;
import jgame.ImageCache;

public class EnemyFour extends Enemy {

private double slownes = 4.0;

public EnemyFour() {
	super(ImageCache.getImage("enemies/enemy4.png"), 400, 120);
}
	@Override
	public double getSlowness() {
		return slownes;
	}
	
	public  void setSlowness(int s) {
		slownes = s;
	}


}
