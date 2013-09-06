package pkids;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;

import jgame.GObject;
import jgame.GSprite;
import jgame.controller.PolygonController;
import jgame.listener.BoundaryRemovalListener;

public abstract class Enemy extends GSprite { // can not instantiate an abstract
												// class

	public Enemy(Image image) {
		super(image);
		setScale(0.75);
		int[] x = new int[] { 660, 660, 658, 654, 647, 635, 615, 590, 565, 544,
				523, 502, 480, 458, 434, 409, 382, 356, 331, 306, 282, 258,
				236, 215, 196, 179, 164, 153, 143, 136, 132, 133, 134, 137,
				142, 150, 162, 176, 190, 207, 225, 245, 266, 288, 312, 337,
				362, 387, 412, 437, 462, 483, 505, 526, 544, 558, 559, 543,
				521, 496, 474, 453, 432, 409, 384, 359, 334, 311, 288, 266,
				248, 234, 222, 212, 207, 208, 212, 222, 236, 251, 270, 290,
				311, 334, 359, 384, 408, 422, 420, 402, 379, 355, 332, 312,
				299, 293, 297, 311, 331, 354, 379, 404, 426, 447, 465, 485,
				510, 535, 560, 585, 610, 635, 660, 685, 710, 735, 760, 787,
				814, 839, 865 };
		int[] y = new int[] { 5, 32, 57, 82, 107, 129, 145, 150, 147, 133, 119,
				105, 92, 80, 71, 67, 67, 67, 69, 76, 86, 96, 109, 124, 142,
				161, 182, 205, 228, 253, 278, 303, 328, 353, 378, 402, 425,
				447, 468, 487, 505, 521, 535, 547, 557, 564, 566, 567, 564,
				563, 556, 542, 530, 515, 497, 476, 451, 431, 419, 424, 437,
				453, 468, 478, 483, 481, 473, 463, 451, 438, 420, 399, 377,
				353, 328, 303, 278, 255, 234, 213, 195, 178, 164, 153, 148,
				149, 158, 180, 205, 224, 235, 245, 257, 273, 295, 320, 345,
				366, 382, 392, 394, 389, 376, 360, 341, 324, 317, 318, 319,
				320, 321, 323, 322, 320, 319, 318, 316, 316, 316, 315, 315 };
		Polygon p = new Polygon(x, y, 121);
		PolygonController pc = new PolygonController(p);

		pc.goToStart(this);
		pc.setRotateToFollow(false);

		double slowness = getSlowness();
		pc.setMaxSpeed(slowness*3);

		addController(pc);

		BoundaryRemovalListener brl = new BoundaryRemovalListener();
		addListener(brl);
	}

	@Override
	public void preparePaint(Graphics2D g) {
		super.preparePaint(g);
		GObject.antialias(g);
		goodImageTransforms(g);
	}

	/**
	 * Gets the slowness (the time spent between waypoints) of this enemy.
	 * 
	 * @return the slowness
	 */
	public abstract double getSlowness();

}
