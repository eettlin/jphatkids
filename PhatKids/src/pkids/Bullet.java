package pkids;

import java.awt.Image;
import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.HitTestListener;
import jgame.listener.Listener;

public class Bullet extends GSprite {

	double bd;

	public Bullet(Image image, double bulletDamage) {
		super(image);
		bd = bulletDamage;
		addListener(new BoundaryRemovalListener());
		HitTestListener htl = new HitTestListener(Enemy.class) {

			@Override
			public void invoke(GObject target, Context context) {
				// target is the bullet and context is the crystal ball
				// interface
				// import java.util.list (not java.awt)
				List<Enemy> enemies = context.hitTestClass(Enemy.class);
				/*
				 * for(int i = 0; i < enemies.size();i++) {
				 * 
				 * }
				 */

				for (Enemy enemy : enemies) {
					enemy.removeSelf();
				}

				target.removeSelf();
			}
		};
		addListener(htl);
	}

}
