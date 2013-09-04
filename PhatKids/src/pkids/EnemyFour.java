package pkids;

import jgame.ImageCache;

public class EnemyFour extends Enemy {
public EnemyFour() {
	// TODO Auto-generated constructor stub
	super(ImageCache.forClass(PhatKids.class).get("enemy4.png"));
}
	@Override
	public double getSlowness() {
		// TODO Auto-generated method stub
		return 6;
	}

}
