package pkids;

import java.awt.Polygon;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.SoundManager;
import jgame.controller.MouseLocationController;
import jgame.listener.LocalClickListener;
import pkids.areas.InfoArea;
import pkids.areas.MenuArea;
import pkids.areas.PKPlayArea;
import pkids.areas.ToolArea;
import pkids.turrets.RangeRing;
import pkids.turrets.Turret;
import pkids.turrets.TurretFour;

public class PhatKidsGameView extends GContainer {

	private PKPlayArea pa = new PKPlayArea();
	private boolean settingTurret = false;
	private Bank mBank = new Bank(500);

	public PhatKidsGameView() {
		SoundManager.forClass(PhatKids.class).loopForever("crave.ogg");

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
		InfoArea ia = new InfoArea(mBank);
		ia.setAnchorTopLeft();
		ia.setLocation(500, 600);
		add(ia);

		// Create Tool area and locate on stage
		ToolArea ta = new ToolArea();
		ta.setAnchorTopLeft();
		ta.setLocation(0, 0);
		add(ta);

	}
	//called from Enemy when enemy dies.  Adds value to bank
	public void changeLocalBankValue(int lbv)
	{
		mBank.changeBankValue(lbv);
	}
	
	public void initializeTurret(final Turret t) {
		//will only set one turret at a time
		if (settingTurret) {
			return;
		}
		//Check for sufficient funds for turret
        if (t.getTurretValue() > mBank.getBankValue()) {
            return;
        }
        //only if sufficient funds and not setting turret
		mBank.changeBankValue(-t.getTurretValue());				// reset bank value
		settingTurret = true; 							// This is only run when init turret

		final RangeRing rr = new RangeRing(t.getFireRange());
		this.pa.addAtCenter(rr);

		this.pa.addAtCenter(t);
		final MouseLocationController c = new MouseLocationController(); 
		t.addController(c); // attach controller to turret t
		rr.addController(c);

		final int[] x = new int[] { 657, 657, 656, 654, 650, 640, 618, 593,
				568, 545, 524, 502, 481, 459, 436, 411, 386, 360, 335, 309,
				285, 262, 241, 221, 204, 188, 174, 162, 151, 143, 138, 135,
				135, 137, 143, 151, 162, 174, 190, 207, 226, 247, 270, 294,
				318, 343, 368, 393, 418, 443, 468, 492, 514, 535, 549, 555,
				548, 526, 501, 478, 456, 434, 411, 386, 360, 335, 311, 288,
				268, 250, 237, 228, 219, 213, 213, 216, 223, 233, 246, 264,
				285, 308, 333, 358, 383, 407, 416, 417, 408, 385, 361, 337,
				316, 302, 300, 304, 314, 330, 353, 378, 403, 426, 443, 459,
				477, 501, 526, 551, 576, 601, 626, 651, 676, 701, 726, 751,
				776, 801, 950 };
		final int[] y = new int[] { 4, 31, 56, 81, 106, 129, 143, 148, 147,
				137, 123, 109, 95, 83, 73, 67, 66, 66, 68, 74, 83, 93, 107,
				123, 142, 163, 184, 206, 229, 253, 278, 304, 330, 355, 380,
				404, 428, 450, 470, 489, 506, 521, 533, 543, 551, 557, 559,
				555, 551, 548, 543, 533, 520, 505, 484, 459, 434, 422, 423,
				434, 450, 463, 474, 479, 479, 473, 464, 453, 437, 418, 396,
				371, 347, 322, 296, 269, 244, 221, 199, 181, 165, 154, 147,
				144, 143, 151, 175, 200, 224, 234, 242, 251, 267, 288, 313,
				338, 361, 381, 392, 397, 396, 385, 366, 346, 328, 319, 316,
				318, 322, 323, 321, 318, 316, 318, 316, 314, 315, 313, 313 };
		
		final Polygon p = new Polygon(x, y, 119);

		final int[] xwater = new int[] { 746, 740, 732, 723, 712, 701, 689,
				674, 656, 635, 613, 589, 566, 542, 517, 492, 468, 444, 420,
				398, 377, 356, 335, 315, 297, 281, 266, 249, 233, 216, 199,
				182, 163, 143, 122, 102, 81, 61 };
		final int[] ywater = new int[] { 2, 27, 51, 75, 98, 121, 143, 164, 183,
				199, 212, 221, 232, 240, 247, 254, 262, 270, 278, 291, 305,
				320, 334, 350, 369, 389, 410, 429, 449, 468, 487, 506, 524,
				540, 554, 570, 585, 601 };
		final Polygon pwater = new Polygon(xwater, ywater, 38);

		final LocalClickListener dropListener = new LocalClickListener() { 
			@Override
			public void invoke(GObject target, Context context) {
				//Check to see if close to road
				for (int i = 0; i < p.npoints; i++) {
					if (target.distanceTo(x[i], y[i]) < 30) {
						return;
					}
				}
				for (int i = 0; i < pwater.npoints; i++) {
					if (!(t instanceof TurretFour)
							&& (t.distanceTo(xwater[i], ywater[i]) < 30 || target
									.distanceTo(377, 305) < 50)) {
						return;
					}
				}
				
				for (GObject child : pa.getObjects()) {
					if (child != t && child instanceof Turret && child.hitTest(t)) 
					{
						return;
					}
				}
				target.removeController(c);
				target.removeListener(this);
				rr.removeController(c);
				rr.removeSelf();
				settingTurret = false;
				t.setPlaced(true); // because t is set to final otherwise above
			}
		};
		t.addListener(dropListener);
	}

}
