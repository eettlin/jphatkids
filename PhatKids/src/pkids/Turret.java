package pkids;

import java.awt.Image;
import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.controller.ConstantMovementController;
import jgame.listener.FrameListener;

public abstract class Turret extends GSprite {

	private boolean placed = false;
	private int fireTimer = 0;

	public Turret(Image image) {
		super(image);
		// TODO Auto-generated constructor stub

		this.addListener(new FrameListener() {

			@Override
			public void invoke(GObject target, Context context) {

				// if not placed exit the invoke function
				if (!placed) {
					return;
				}

				// set rotaation of turret to point toward nearest enemy
				List<Enemy> enemies = context.getInstancesOfClass(Enemy.class);
				double minimumDistance = 200 ;
				Enemy closest = null;

				for (Enemy e : enemies) {
					double d = e.distanceTo(target);
					if (d < minimumDistance) {
						minimumDistance = d;
						closest = e;
					}
				}

				if (closest != null) {
					target.face(closest);
					target.setRotation(target.getRotation());
					
					// If placed fire bullet and range OK
					// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					fireTimer--;
					
					if (fireTimer < 0) {
						fireBullet();
						fireTimer = getFireDelay();
					}
				}

				

			}

		}); // End of the invoke method from the frame listener

	}

	public abstract int getFireDelay();

	public abstract double getBulletSpeed();

	public abstract Bullet createBullet();

	public void fireBullet() {
		// create an instance of BulletOne
		Bullet b = createBullet(); //new Bullet(getBulletImage(), getBulletDamage());
		// set direction of bullet one
		b.setRotation(this.getRotation());
		// move the bullets at a particular speed
		ConstantMovementController c = ConstantMovementController.createPolar(
				this.getBulletSpeed(), this.getRotation());
		c.setDamping(1.2);
		b.addController(c);
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
