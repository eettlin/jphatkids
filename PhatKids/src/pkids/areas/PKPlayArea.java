package pkids.areas;

import java.awt.Color;
import java.awt.image.BufferedImage;

import pkids.HeroKid;
import pkids.PhatKids;
import pkids.enemies.Enemy;
import pkids.enemies.EnemyFour;
import pkids.enemies.EnemyOne;
import pkids.enemies.EnemyThree;
import pkids.enemies.EnemyTwo;
import jgame.Context;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.listener.DelayListener;
import jgame.listener.TimerListener;

public class PKPlayArea extends GContainer {

	private int enemyBurstDelay = 0;
	private int enemyBurstNum = 0;

	public PKPlayArea() {
		setSize(800, 600);
		this.setBackgroundColor(Color.BLACK);
		BufferedImage bg = ImageCache.getImage("areas/bg1.png");
		GSprite gs = new GSprite(bg);
		setBackgroundSprite(gs);

		HeroKid hk = new HeroKid();
		addAtCenter(hk);

		final TimerListener pkEnemyTimer = new TimerListener(24) {
			@Override
			public void invoke(GObject target, Context context) {
				enemyBurstDelay--;
				if (enemyBurstDelay <= 0 && enemyBurstNum <= 4) {
					addRandomEnemy();
					enemyBurstNum++;
					if (enemyBurstNum > 3) {
						enemyBurstDelay = 12;
						enemyBurstNum = 0;
					}
				}
			}
		};

		TimerListener tlAdd = new TimerListener(180) {
			@Override
			public void invoke(GObject target, Context context) {
				addListener(pkEnemyTimer);
			}
		};

		final TimerListener tlRemove = new TimerListener(180) {
			@Override
			public void invoke(GObject target, Context context) {
				removeListener(pkEnemyTimer);
			}
		};
		addListener(pkEnemyTimer);
	}

	private void addRandomEnemy() {

		int enemyPick = (int) (Math.random() * 4);

		Enemy e = null;

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

		this.add(e);

	}
}
