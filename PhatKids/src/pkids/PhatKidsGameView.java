package pkids;

import jgame.GContainer;
import jgame.controller.MouseLocationController;

public class PhatKidsGameView extends GContainer {

	private PKPlayArea pa = new PKPlayArea();

	public PhatKidsGameView() {
		// Set the size.
		setSize(900, 700);

		// Create play area and locate on stage
		pa.setAnchorTopLeft();
		pa.setLocation(100, 0);
		add(pa);

		// Create Menu area and locate on stage
		MenuArea ma = new MenuArea();
		ma.setAnchorTopLeft();
		ma.setLocation(0, 600);
		add(ma);

		// Create Info area and locate on stage
		InfoArea ia = new InfoArea();
		ia.setAnchorTopLeft();
		ia.setLocation(500, 600);
		add(ia);

		// Create Tool area and locate on stage
		ToolArea ta = new ToolArea();
		ta.setAnchorTopLeft();
		ta.setLocation(0, 0);
		add(ta);

	}

	public void initializeTurret(Turret t) {
		this.pa.addAtCenter(t);
		final MouseLocationController c = new MouseLocationController();
		t.addController(c);
	}

}

/*
 * BufferedImage bi =
 * ImageCache.forClass(PhatKids.class).get("gameover.png");GSprite gs = new
 * GSprite(bi);setBackgroundSprite(gs);
 */
// BufferedImage bg = ImageCache.forClass(PhatKids.class).get("bg2.png");
// GSprite gs = new GSprite(bg);
// setBackgroundSprite(gs);