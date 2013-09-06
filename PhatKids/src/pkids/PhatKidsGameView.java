package pkids;

import java.util.List;

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

	public void initializeTurret(Turret t) {
		if (settingTurret) {
			return;
		}

		this.pa.addAtCenter(t);
		final MouseLocationController c = new MouseLocationController();
		t.addController(c);

		final LocalClickListener dropListener = new LocalClickListener() {
			@Override
			public void invoke(GObject target, Context context) {
				// TODO Auto-generated method stub
				target.removeController(c);
				target.removeListener(this);
				settingTurret = false;

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
			}
		};
		t.addListener(dropListener);
		settingTurret = true;
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