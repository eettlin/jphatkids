package pkids;

import java.awt.Image;
import java.awt.Polygon;

import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.listener.BoundaryRemovalListener;
import jgame.listener.Listener;

public abstract class Enemy extends GSprite { // can not instantiate an abstract
												// class

	public Enemy(Image image) {
		super(image);

		int[] x = new int[] { 811, 786, 760, 734, 708, 683, 658, 630, 601, 571,
				545, 516, 490, 465, 440, 413, 386, 360, 329, 300, 275, 248,
				223, 198, 173, 152, 131, 116, 120, 144, 168, 193, 217, 240,
				264, 290, 316, 340, 363, 388, 414, 440, 467, 492, 517, 543,
				565, 583, 590, 587, 569, 546, 520, 492, 465, 434, 409, 380,
				353, 325, 296, 271, 245, 216, 189, 161, 135, 109, 79, 54, 29, 1 ,-200};
		int[] y = new int[] { 95, 100, 103, 103, 106, 100, 98, 98, 98, 98, 97,
				97, 97, 103, 108, 110, 111, 109, 109, 110, 112, 112, 116, 121,
				129, 143, 159, 181, 206, 218, 229, 241, 252, 262, 271, 272,
				275, 283, 293, 300, 309, 318, 324, 332, 337, 346, 359, 377,
				402, 427, 446, 457, 463, 469, 475, 479, 481, 489, 491, 496,
				496, 497, 499, 500, 499, 500, 500, 500, 500, 502, 507, 509, 509 };
		Polygon p = new Polygon(x, y, 73);
		PolygonController pc = new PolygonController(p);

		pc.goToStart(this);
		pc.setRotateToFollow(false);

		double slowness = getSlowness();
		pc.setMaxSpeed(slowness);

		addController(pc);

		BoundaryRemovalListener brl = new BoundaryRemovalListener();
		addListener(brl);
	}

	/**
	 * Gets the slowness (the time spent between waypoints) of this enemy.
	 * 
	 * @return the slowness
	 */
	public abstract double getSlowness();

}
