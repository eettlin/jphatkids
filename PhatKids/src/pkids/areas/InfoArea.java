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

		cashEquals_txt = new GMessage();
		
		cashEquals_txt.setX(50);
		cashEquals_txt.setY(30);
		cashEquals_txt.setColor(Color.getHSBColor(1f / 6f, 0.75f, 1f));
		cashEquals_txt.setFont(new Font("Times New Roman", Font.BOLD, 48));
		cashEquals_txt.setText("Cash =  $");
		add(cashEquals_txt);
		
		displayBankValue = new GMessage();
		displayBankValue.setX(250);
		displayBankValue.setY(30);
		displayBankValue.setColor(Color.getHSBColor(1f / 6f, 0.75f, 1f));
		displayBankValue.setFont(new Font("Times New Roman", Font.BOLD, 48));
		add(displayBankValue);
	}

	public void setDisplayValue(int newValue) {
		displayBankValue.setText(Integer.toString(newValue));
	}

}
