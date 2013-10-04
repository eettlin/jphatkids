package pkids;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import jgame.ButtonState;
import jgame.Context;
import jgame.GButton;
import jgame.GContainer;
import jgame.GObject;
import jgame.GSprite;
import jgame.ImageCache;
import jgame.controller.Interpolation;
import jgame.controller.MovementTween;
import jgame.controller.RotationTween;
import jgame.controller.ScaleTween;
import jgame.listener.ButtonListener;
import jgame.listener.DelayListener;
import pkids.PhatKids.Views;

public class PhatKidsMainMenuView extends GContainer {

	public PhatKidsMainMenuView() {
		setSize(900, 700);
		this.setBackgroundColor(Color.GRAY);
		BufferedImage bg = ImageCache.forClass(PhatKids.class).get(
				"areas/MenuArea.png");
		GSprite gs = new GSprite(bg);
		this.setBackgroundSprite(gs);

		GButton mbPlay = createButton(0);
		
		mbPlay.setLocation(-100, 200);
//		add(mbPlay);
		GButton mbInstructions = createButton(1);
		mbInstructions.setLocation(-100, 300);
//		add(mbInstructions);

		ButtonListener bl = new ButtonListener() {
			// goto Source --> Override and Implement
			@Override
			public void mouseClicked(Context context) {
				super.mouseClicked(context);
				context.setCurrentGameView(Views.GAME);
			}

		};
		mbPlay.addListener(bl);

	}

	private GButton createButton(final int buttonIndex) {
		
		MovementTween mt = new MovementTween(24, Interpolation.EASE_IN,  400, 0);
		MovementTween mtb = new MovementTween(6, Interpolation.EASE_OUT, -40,
				0);
		RotationTween rt = new RotationTween(12, 0, 360);
		ScaleTween st = new ScaleTween(10, 1, 5);
		ScaleTween st2 = new ScaleTween(10, 5, 1);
		mt.chain(mtb, rt, st, st2);
		final GButton btn = new GButton();
		btn.setStateSprite(ButtonState.NONE,
				createButtonSprite("buttons/buttonup.png"));
		btn.setStateSprite(ButtonState.HOVERED,
				createButtonSprite("buttons/buttonhover.png"));
		btn.setStateSprite(ButtonState.PRESSED,
				createButtonSprite("buttons/buttonpressed.png"));
		btn.addController(mt);
		btn.setSize(150, 50);
		
		DelayListener dl = new DelayListener(buttonIndex * 10) {
			
			@Override
			public void invoke(GObject target, Context context) {
				addAt(btn, -100, buttonIndex * 100+200);
			}
		};
		addListener(dl);
		return btn;
	}

	public static GSprite createButtonSprite(String fn) {
		BufferedImage img = ImageCache.forClass(PhatKids.class).get(fn);
		GSprite gs = new GSprite(img);

		Rectangle nineSliceCenter = new Rectangle(15, 15, 6, 6);
		gs.setNineSliceCenter(nineSliceCenter);
		return gs;
	}

}

