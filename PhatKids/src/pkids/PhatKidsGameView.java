package pkids;

import java.awt.image.BufferedImage;

import jgame.GContainer;
import jgame.GSprite;
import jgame.ImageCache;

public class PhatKidsGameView extends GContainer {

	
	public PhatKidsGameView() {
		// Set the size.
		setSize(900	, 600);
		/*
		 * BufferedImage bi = ImageCache.forClass(PhatKids.class).get("gameover.png");
		 *GSprite gs = new GSprite(bi);
		 *setBackgroundSprite(gs);
		 */
	    BufferedImage bg = ImageCache.forClass(PhatKids.class).get("bg2.png");
	    GSprite gs = new GSprite(bg);
		setBackgroundSprite(gs);
		
		//BufferedImage enemyOne = ImageCache.forClass(PhatKids.class).get("enemy1.png");
		
		//Image e1Image = 
		//Enemy e1 = new Enemy( Image(enemyOne) );
		
		/*
		 * int[] x = new int[] { 898, 872, 846, 821, 796, 770, 744, 718, 692,
		 * 667, 640, 614, 588, 562, 537, 510, 483, 458, 432, 406, 381, 355, 329,
		 * 304, 279, 253, 228, 203, 180, 159, 143, 131, 140, 162, 185, 209, 235,
		 * 260, 286, 312, 337, 363, 389, 414, 439, 464, 489, 514, 539, 563, 586,
		 * 611, 635, 657, 670, 669, 655, 637, 616, 591, 566, 542, 518, 492, 465,
		 * 438, 413, 386, 360, 333, 306, 280, 255, 230, 205, 179, 153, 128, 103,
		 * 77, 52, 27, 0 };
		 * 
		 *  int[] y = new int[] { 99, 99, 99, 100, 98, 95, 92,
		 * 90, 89, 88, 88, 90, 93, 93, 94, 96, 98, 100, 100, 101, 104, 107, 111,
		 * 114, 115, 115, 117, 120, 132, 148, 168, 190, 214, 228, 240, 250, 258,
		 * 263, 267, 270, 272, 277, 283, 290, 297, 304, 310, 316, 322, 330, 340,
		 * 345, 353, 365, 387, 412, 433, 451, 465, 467, 468, 476, 484, 493, 501,
		 * 504, 507, 507, 505, 499, 498, 498, 497, 493, 492, 492, 492, 495, 498,
		 * 500, 499, 503, 503 }; Polygon p = new Polygon(x, y, 83);
		 * PolygonController pc = new PolygonController(p);
		 */
		
	}
}
