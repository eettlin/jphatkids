package pkids;

import java.awt.Image;
import java.util.List;

import jgame.Context;
import jgame.GObject;
import jgame.GSprite;
import jgame.listener.FrameListener;

public abstract class Turret extends GSprite {

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	private boolean placed = false;

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
				double minimumDistance = Integer.MAX_VALUE;
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
					target.setRotation(target.getRotation() + 90);
				}
				
				// fire bullet  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					fireBullet();
				
			}

		}); // End of the invoke method from the frame listener
		
		

	}
	
	public void fireBullet(){
		// create an instance of BulletOne
		Bullet b = new BulletOne();
		//set direction of bullet one
		
		//
		
		
	}

}
