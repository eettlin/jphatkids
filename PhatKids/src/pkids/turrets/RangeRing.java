package pkids.turrets;

import java.awt.Color;
import java.awt.Graphics2D;

import jgame.GObject;

public class RangeRing extends GObject {
	public RangeRing(double radius) {
		setSize(radius*2, radius*2);
	}

	// William promises paint will be called every frame
	@Override
	public void paint(Graphics2D g) {
		super.paint(g);
		// g is a graphics context
		// build a white circle
		g.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));

		// If we wanted to draw (outline) it we would set the stroke as follows:
		// BasicStroke bs = new BasicStroke(2);
		// g.setStroke(bs);
		// g.drawOval(1, 1, getIntWidth() - 2, getIntHeight() - 2);

		
		// Instead we'll fill it in:
		g.fillOval(0, 0, getIntWidth(), getIntHeight());
	}

	@Override
	public void preparePaint(Graphics2D g) {
		// TODO Auto-generated method stub
		super.preparePaint(g);
		antialias(g);
		
	}
}
