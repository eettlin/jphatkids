package pkids.enemies;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;

import jgame.GObject;
import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.controller.PulsateController;
import jgame.listener.BoundaryRemovalListener;
import pkids.HealthBar;

public abstract class Enemy extends GSprite { // can not instantiate an abstract
												// class
	private double maxHealth;
	private double currentHealth;
	private HealthBar hb = new HealthBar();

	public Enemy(Image image, double maxHlth) {
		super(image);
		maxHealth = maxHlth;
		currentHealth = maxHealth;

		hb.setWidth(getWidth());
		addAtCenter(hb);
		hb.setY(this.getHeight() - hb.getHeight() / 2);
		hb.setHealthPercentage(1);

		setScale(0.75);
		int[] x = new int[] { 657, 657, 656, 654, 650, 640, 618, 593, 568, 545,
				524, 502, 481, 459, 436, 411, 386, 360, 335, 309, 285, 262,
				241, 221, 204, 188, 174, 162, 151, 143, 138, 135, 135, 137,
				143, 151, 162, 174, 190, 207, 226, 247, 270, 294, 318, 343,
				368, 393, 418, 443, 468, 492, 514, 535, 549, 555, 548, 526,
				501, 478, 456, 434, 411, 386, 360, 335, 311, 288, 268, 250,
				237, 228, 219, 213, 213, 216, 223, 233, 246, 264, 285, 308,
				333, 358, 383, 407, 416, 417, 408, 385, 361, 337, 316, 302,
				300, 304, 314, 330, 353, 378, 403, 426, 443, 459, 477, 501,
				526, 551, 576, 601, 626, 651, 676, 701, 726, 751, 776, 801 };
		int[] y = new int[] { 4, 31, 56, 81, 106, 129, 143, 148, 147, 137, 123,
				109, 95, 83, 73, 67, 66, 66, 68, 74, 83, 93, 107, 123, 142,
				163, 184, 206, 229, 253, 278, 304, 330, 355, 380, 404, 428,
				450, 470, 489, 506, 521, 533, 543, 551, 557, 559, 555, 551,
				548, 543, 533, 520, 505, 484, 459, 434, 422, 423, 434, 450,
				463, 474, 479, 479, 473, 464, 453, 437, 418, 396, 371, 347,
				322, 296, 269, 244, 221, 199, 181, 165, 154, 147, 144, 143,
				151, 175, 200, 224, 234, 242, 251, 267, 288, 313, 338, 361,
				381, 392, 397, 396, 385, 366, 346, 328, 319, 316, 318, 322,
				323, 321, 318, 316, 318, 316, 314, 315, 313 };
		Polygon p = new Polygon(x, y, 118);
		PolygonController pc = new PolygonController(p);

		pc.goToStart(this);
		pc.setRotateToFollow(false);

		double slowness = getSlowness();
		pc.setMaxSpeed(slowness * 3);

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

	@Override
	public void preparePaint(Graphics2D g) {
		super.preparePaint(g);
		GObject.antialias(g);
		goodImageTransforms(g);
	}

	public double getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
		hb.setHealthPercentage(this.currentHealth / maxHealth);
	}

}
