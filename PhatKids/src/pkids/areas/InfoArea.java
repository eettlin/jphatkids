package pkids.areas;

import java.awt.Color;
import java.awt.Font;

import pkids.Bank;

import jgame.Context;
import jgame.GContainer;
import jgame.GMessage;
import jgame.GObject;
import jgame.listener.FrameListener;

public class InfoArea extends GContainer {
	
	private GMessage moneyBankValue = new GMessage();
	
	public InfoArea(final Bank bv) {

		setSize(400, 100);
		this.setBackgroundColor(Color.gray);
		
		moneyBankValue.setLocation(50, 30);
        this.add(moneyBankValue);

        moneyBankValue.setColor(Color.YELLOW);
        moneyBankValue.setFontSize(30);
        moneyBankValue.setFontStyle(Font.BOLD | Font.ITALIC);

        FrameListener updateListener = new FrameListener() {
			
			@Override
			public void invoke(GObject target, Context context) {
				setMoneyBankValue(bv.getBankValue());
			}
		};
    addListener(updateListener);
	}
	
	public void setMoneyBankValue(int bv)
	{
		moneyBankValue.setText("Bank Value = " + Integer.toString(bv));
	}
	
	
}
