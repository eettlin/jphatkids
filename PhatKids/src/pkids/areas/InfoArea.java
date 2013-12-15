package pkids.areas;

import java.awt.Color;
import java.awt.Font;

import pkids.Bank;

import jgame.Context;
import jgame.GContainer;
import jgame.GMessage;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.FrameListener;

public class InfoArea extends GContainer {
	
	private GMessage moneyBankValue = new GMessage();
	private GMessage lifeBankValue = new GMessage();
	
	public InfoArea(final Bank bv, final Bank lv) {

		setSize(400, 100);
		this.setBackgroundColor(Color.black);
		
		
		GSprite bgs = ImageCache.getSprite("areas/infoarea.png");
		bgs.setAnchorCenter();
		addAtCenter(bgs);
		
		
		moneyBankValue.setLocation(30, 40);
        this.add(moneyBankValue);
        moneyBankValue.setColor(Color.YELLOW);
        moneyBankValue.setFontSize(18);
        moneyBankValue.setFontStyle(Font.BOLD | Font.ITALIC);
        
        lifeBankValue.setLocation(230, 40);
        this.add(lifeBankValue);
        lifeBankValue.setColor(Color.YELLOW);
        lifeBankValue.setFontSize(18);
        lifeBankValue.setFontStyle(Font.BOLD | Font.ITALIC);

        FrameListener updateListener = new FrameListener() {
			
			@Override
			public void invoke(GObject target, Context context) {
				setMoneyBankValue(bv.getBankValue());
				setLifeBankValue(lv.getBankValue());
			}
		};
    addListener(updateListener);
	}
	
	public void setMoneyBankValue(int bv)
	{
		moneyBankValue.setText("Bank Value = $" + Integer.toString(bv));
	}
	
	public void setLifeBankValue(int lv)
	{
		lifeBankValue.setText("Life Points =" + Integer.toString(lv));
	}
	
	
}
