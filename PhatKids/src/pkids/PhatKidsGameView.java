package pkids;

import java.awt.image.BufferedImage;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.TimerListener;

public class PhatKidsGameView extends GContainer {

	
	public PhatKidsGameView() {
		// Set the size.
		setSize(900	, 600);
		/*
		 * BufferedImage bi = ImageCache.forClass(PhatKids.class).get("gameover.png");
		 *GSprite gs = new GSprite(bi);
		 *setBackgroundSprite(gs);
		 */
	    BufferedImage bg = ImageCache.forClass(PhatKids.class).get("bg2.png");
	    GSprite gs = new GSprite(bg);
		setBackgroundSprite(gs);
		
		
		TimerListener pkEnemyTimer = new TimerListener(45) {
			
			@Override
			public void invoke(GObject target, Context context) {
				addRandomEnemy();
			}
		};
		
		addListener(pkEnemyTimer);
		
		
		
		
	}

	private void addRandomEnemy() {
		
		int enemyPick = (int)(Math.random()*3);
		Enemy e = null;
		// 
		switch(enemyPick){
		case 0:
			 e = new EnemyOne();
			break;
			
		case 1:
			 e = new EnemyTwo();
			break;
			
		case 2:
			 e = new EnemyThree();

			break;
			
		 default:
			 e = new EnemyTwo();
			break;
		}
		
		add(e);
		
	}
}
