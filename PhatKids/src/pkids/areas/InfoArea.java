package pkids.areas;

import java.awt.Color;
import java.awt.Font;

import jgame.GContainer;
import jgame.GMessage;

public class InfoArea extends GContainer {

	private GMessage displayBankValue;
	private GMessage cashEquals_txt;

	public InfoArea() {
		setSize(400, 100);
		this.setBackgroundColor(Color.BLACK);
		displayBankValue = new GMessage();
		displayBankValue.setX(50);
		displayBankValue.setY(30);
		displayBankValue.setColor(Color.getHSBColor(1f / 6f, 0.75f, 1f));
		displayBankValue.setFont(new Font("Times New Roman", Font.BOLD, 48));
		add(displayBankValue);
	}

	public void setDisplayValue(int newValue) {
		displayBankValue.setText("Cash =  $" + Integer.toString(newValue));
	}

}
