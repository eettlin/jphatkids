package pkids.areas;

import java.awt.Color;
import java.awt.Font;

import jgame.GContainer;
import jgame.GMessage;

public class InfoArea extends GContainer {

	private GMessage gm;

	public InfoArea() {
		setSize(400, 100);

		this.setBackgroundColor(Color.BLACK);

		gm = new GMessage();
		setDisplayValue(0);

		gm.setX(50);
		gm.setY(50);
		add(gm);
		gm.setColor(Color.getHSBColor(1f / 6f, 0.75f, 1f));
		gm.setFont(new Font("Times New Roman", Font.BOLD, 24));
	}

	public void setDisplayValue(int newValue) {
		gm.setText(Integer.toString(newValue));
	}

}
