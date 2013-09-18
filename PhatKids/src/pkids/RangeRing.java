package pkids;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import jgame.GObject;

public class RangeRing extends GObject {
	public RangeRing(double radius) {
		setSize(radius, radius);
	}

	// William promises paint will be called every frame
	@Override
	public void paint(Graphics2D g) {
		super.paint(g);
		// g is a graphics context
		// build a white circle
		g.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
		BasicStroke bs = new BasicStroke(2);
		g.setStroke(bs);
		g.drawOval(1, 1, getIntWidth() - 2, getIntHeight() - 2);

	}
}
