package pkids;

import java.awt.Image;
import java.awt.Polygon;

import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.listener.BoundaryRemovalListener;

public abstract class Enemy extends GSprite { // can not instantiate an abstract
												// class

	public Enemy(Image image) {
		super(image);

		int[] x = new int[] { 790, 765, 739, 714, 687, 661, 636, 608, 582, 554,
				529, 504, 478, 451, 424, 395, 369, 342, 314, 289, 261, 234,
				208, 181, 157, 137, 123, 120, 139, 161, 184, 210, 236, 261,
				287, 313, 339, 364, 389, 414, 439, 464, 488, 513, 537, 559,
				583, 602, 608, 596, 577, 555, 529, 503, 476, 451, 425, 397,
				371, 346, 319, 294, 267, 240, 212, 183, 158, 131, 104, 75, 45,
				16, -11, -36, -64, -91, -118, -147, -172, -197, -223, -249 };
		int[] y = new int[] { 101, 100, 95, 91, 89, 87, 86, 86, 87, 87, 89, 91,
				94, 98, 100, 100, 100, 101, 103, 105, 108, 112, 118, 126, 138,
				154, 175, 200, 218, 231, 241, 248, 255, 261, 266, 273, 281,
				288, 295, 303, 312, 322, 333, 340, 350, 362, 373, 390, 415,
				437, 455, 468, 475, 481, 486, 488, 488, 488, 489, 490, 491,
				492, 494, 496, 497, 499, 501, 503, 506, 508, 509, 512, 514,
				517, 520, 524, 527, 529, 531, 532, 533, 532 };
		Polygon p = new Polygon(x, y, 82);
		PolygonController pc = new PolygonController(p);

		pc.goToStart(this);
		pc.setRotateToFollow(true);

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
