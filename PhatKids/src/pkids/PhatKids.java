  package pkids;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;
import jgame.SoundManager;

public class PhatKids extends Game {

	// Game class has all the mthods that link JGame to awt.
	public static void main(String[] args) {
		ImageCache.create(PhatKids.class, "/pkids/rsc/");
		SoundManager.create(PhatKids.class, "/pkids/rsc/sounds/");
		//Create an instance and assign to a variable
		PhatKids pk1 = new PhatKids();
		//Starts the PhatKids game
		pk1.startGame();
	}	

	public PhatKids(){
		//GRootContainer is not a game object (Deck of cards)
		GRootContainer root = new GRootContainer(Color.BLACK );
		setRootContainer(root);
		
		PhatKidsMainMenuView pkmv = new PhatKidsMainMenuView();
		root.addView(Views.MAIN_MENU, pkmv);
		/*
		PhatKidsInstructionsView pkiv = new PhatKidsInstructionsView();
		root.addView(Views.INSTRUCTIONS, pkiv);*/
		
		// add these two lines for each view
		PhatKidsGameView pkgv = new PhatKidsGameView();
		root.addView(Views.GAME, pkgv);
		
		

	}	

	/**	These are all of the views for this game
	 * @author eettlin
	 *
	 */
	public enum Views{
		//		These are all of the views for this game
		INSTRUCTIONS, MAIN_MENU, GAME, GAME_OVER, OTHER; 
	}

}
