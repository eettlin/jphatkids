package pkids;

import java.awt.Color;
import java.awt.Font;

import jgame.GContainer;
import jgame.GMessage;
import jgame.ImageCache;

public class TextPanel extends GContainer {

	public TextPanel(String title, String... messages) {
		super(ImageCache.getSprite("areas/informationpanel.png"));
		
		Color color = new Color(0xEE, 0xA5, 0x44);
        GMessage mTitle = new GMessage(title);
        
        mTitle.setFontSize(36);
        mTitle.setFontStyle(Font.BOLD);
        mTitle.setColor(color);
        addAt(mTitle, 100, 100);

        final int step = 30;
        int y = 150 - step;
        for (String message : messages) {
                GMessage mMessage = new GMessage(message);
                mMessage.setFontSize(20);
                mMessage.setColor(Color.WHITE);
                addAt(mMessage, 100, y += step);
        }

	}
}
