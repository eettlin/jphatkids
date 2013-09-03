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

		int[] x = new int[] { 898, 872, 846, 821, 796, 770, 744, 718, 692, 667,
				640, 614, 588, 562, 537, 510, 483, 458, 432, 406, 381, 355,
				329, 304, 279, 253, 228, 203, 180, 159, 143, 131, 140, 162,
				185, 209, 235, 260, 286, 312, 337, 363, 389, 414, 439, 464,
				489, 514, 539, 563, 586, 611, 635, 657, 670, 669, 655, 637,
				616, 591, 566, 542, 518, 492, 465, 438, 413, 386, 360, 333,
				306, 280, 255, 230, 205, 179, 153, 128, 103, 77, 52, 27, 0,-100 };

		int[] y = new int[] { 99, 99, 99, 100, 98, 95, 92, 90, 89, 88, 88, 90,
				93, 93, 94, 96, 98, 100, 100, 101, 104, 107, 111, 114, 115,
				115, 117, 120, 132, 148, 168, 190, 214, 228, 240, 250, 258,
				263, 267, 270, 272, 277, 283, 290, 297, 304, 310, 316, 322,
				330, 340, 345, 353, 365, 387, 412, 433, 451, 465, 467, 468,
				476, 484, 493, 501, 504, 507, 507, 505, 499, 498, 498, 497,
				493, 492, 492, 492, 495, 498, 500, 499, 503, 503, 503 };

		Polygon p = new Polygon(x, y, 84);
		PolygonController pc = new PolygonController(p);
		pc.goToStart(this);
		pc.setRotateToFollow(true);

		double slowness = getSlowness();
		pc.setMaxSpeed(slowness);

		addController(pc);
		
	    BoundaryRemovalListener  brl = new BoundaryRemovalListener();
		addListener(brl);
	}

	/**
	 * Gets the slowness (the time spent between waypoints) of this enemy.
	 * 
	 * @return the slowness
	 */
	public abstract double getSlowness();

}
