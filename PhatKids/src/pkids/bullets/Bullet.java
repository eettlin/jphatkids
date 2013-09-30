package pkids.bullets;

import java.awt.Image;
import java.awt.Point;
import java.util.List;

import pkids.PhatKids;
import pkids.enemies.Enemy;
import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.SoundManager;
import jgame.controller.ScaleTween;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.HitTestListener;

public class Bullet extends GSprite {

	private double bd;
	private Point initialPosition = new Point();

	public Bullet(Image image, double bulletDamage) {
		super(image);
		bd = bulletDamage;
		addListener(new BoundaryRemovalListener());
		HitTestListener htl = new HitTestListener(Enemy.class) {
			// target is the bullet and context is the crystal ball
			// interface
			@Override
			public void invoke(GObject target, Context context) {
				// import java.util.list (not java.awt)
				List<Enemy> enemies = context.hitTestClass(Enemy.class);
				SoundManager.forClass(PhatKids.class).play("bink.wav");
				for (Enemy enemy : enemies) {
					enemy.setCurrentHealth(enemy.getCurrentHealth()-bd);
					if(enemy.getCurrentHealth() <= 0)
					{
					  enemy.removeSelf();
					}
				}
				target.removeSelf();
			}
		};
		addListener(htl);
		
		ScaleTween st = new ScaleTween(30, 2.0, 1);
		addController(st);
	}

	public double getBd() {
		return bd;
	}

	public void setBd(double bd) {
		this.bd = bd;
	}

	public Point getInitialPosition() {
		return initialPosition;
	}

	public void setInitialPosition(Point initialPosition) {
		this.initialPosition = initialPosition;
	}


}
