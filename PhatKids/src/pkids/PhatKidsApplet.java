  package pkids;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.GameApplet;
import jgame.ImageCache;
import jgame.SoundManager;
import pkids.PhatKids.Views;

public class PhatKidsApplet extends GameApplet {

	public PhatKidsApplet(){
		ImageCache.create(PhatKids.class, "/pkids/rsc/");
		SoundManager.create(PhatKids.class, "/pkids/rsc/sounds/");
		//GRootContainer is not a game object (Deck of cards)
		GRootContainer root = new GRootContainer(Color.BLACK );
		core.setRootContainer(root);
		
		PhatKidsMainMenuView pkmv = new PhatKidsMainMenuView();
		root.addView(Views.MAIN_MENU, pkmv);
		
		/*PhatKidsInstructionsView pkiv = new PhatKidsInstructionsView();
		root.addView(Views.INSTRUCTIONS, pkiv);*/
		
		// add these two lines for each view
		PhatKidsGameView pkgv = new PhatKidsGameView();
		root.addView(Views.GAME, pkgv);
	}	

}
