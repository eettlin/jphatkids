package pkids;

import java.awt.Color;
import java.awt.image.BufferedImage;

import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.TimerListener;

public class PKPlayArea extends GContainer {
	public PKPlayArea() {
		// TODO Auto-generated constructor stub
		setSize(800, 600);
		this.setBackgroundColor(Color.BLACK);

		BufferedImage bg = ImageCache.forClass(PhatKids.class).get("areas/bg5.png");
		GSprite bi = new GSprite(bg);
		setBackgroundSprite(bi);

		TimerListener pkEnemyTimer = new TimerListener(45) {

			@Override
			public void invoke(GObject target, Context context) {
				addRandomEnemy();
			}
		};

	addListener(pkEnemyTimer);

	}

	private void addRandomEnemy() {

		int enemyPick = (int) (Math.random() * 4);
		
		Enemy e = null;
		//
		switch (enemyPick) {
		case 0:
			e = new EnemyOne();
			break;

		case 1:
			e = new EnemyTwo();
			break;

		case 2:
			e = new EnemyThree();
			break;
			
		case 3:
			e = new EnemyFour();
			break;

		default:
			e = new EnemyTwo();
			break;
		}

		add(e);

	}
}
