package pkids.turrets;

import java.awt.Image;
import java.util.List;

import pkids.PhatKids;
import pkids.bullets.Bullet;
import pkids.enemies.Enemy;
import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.SoundManager;
import jgame.controller.ConstantMovementController;
import jgame.listener.DelayListener;
import jgame.listener.FrameListener;

public abstract class Turret extends GSprite {

	private boolean placed = false;
	private int fireTimer = 0;

	public Turret(Image image) {
		super(image);
		this.addListener(new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {

				// if not placed exit the invoke function
				if (!placed) {
					return;
				}

				// set rotaation of turret to point toward nearest enemy
				// this is pointing to a list that jgame has created wo alloct
				List<Enemy> enemies = context.getInstancesOfClass(Enemy.class);
				double minimumDistance = Integer.MAX_VALUE;
				Enemy closest = null;

				for (Enemy e : enemies) {
					double d = e.distanceTo(target);
					if (d < minimumDistance) {
						minimumDistance = d;
						closest = e;
					}
				}

				fireTimer--;
				if (closest != null) {
					target.face(closest);
					target.setRotation(target.getRotation());

					// If placed fire bullet and range OK
					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

					if (fireTimer < 0
							&& (closest.distanceTo(target) < getFireRange())) {
						fireBullet();
						SoundManager.forClass(PhatKids.class).play("pop2.wav");
						fireTimer = getFireDelay();
					}
				}

			}

		}); // End of the invoke method from the frame listener

	}

	public abstract double getFireRange();

	public abstract int getFireDelay();

	public abstract double getBulletSpeed();

	public abstract Bullet createBullet();

	public void fireBullet() {
		// create an instance of BulletOne
		final Bullet b = createBullet(); // new Bullet(getBulletImage(),
									// getBulletDamage());
		// set direction of bullet one
		b.setRotation(this.getRotation());
		final ConstantMovementController c = ConstantMovementController.createPolar(
				getBulletSpeed(), getRotation());
		DelayListener dl = new DelayListener(10) {
			
			@Override
			public void invoke(GObject target, Context context) {
				//after specified frames start moving
				c.setDamping(1.1);
				b.addController(c);
			}
		};
		b.addListener(dl);
		// move the bullets at a particular speed
		snapAnchor(b);
		b.moveAtAngle(getWidth() / 2 + 20, getRotation());
		this.addSibling(b);
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

}
