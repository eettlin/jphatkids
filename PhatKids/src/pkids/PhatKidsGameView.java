package pkids;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.controller.MouseLocationController;
import jgame.listener.LocalClickListener;

public class PhatKidsGameView extends GContainer {

	private PKPlayArea pa = new PKPlayArea();
	private boolean settingTurret = false;

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

	public void initializeTurret(final Turret t) {
		if (settingTurret) {
			return;
		}

		this.pa.addAtCenter(t);
		final MouseLocationController c = new MouseLocationController();  	// create mouse location controller
		t.addController(c);													// attach controller to turret t

			
		final LocalClickListener dropListener = new LocalClickListener() {  // mouse click listener hears click on  turret (see below)
			@Override
			public void invoke(GObject target, Context context) {
				target.removeController(c);  
				target.removeListener(this);
				settingTurret = false;
				//((Turret) target).setPlaced(true); 
				t.setPlaced(true); //because t is set to final otherwise above
			}
		};
		t.addListener(dropListener);
		settingTurret = true;  // This is only run when init turret 
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