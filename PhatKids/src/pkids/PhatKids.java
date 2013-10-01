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
		GRootContainer root = new GRootContainer(Color.BLUE );
		setRootContainer(root);
		
		// add these two lines for each view
		PhatKidsGameView pkgv = new PhatKidsGameView();
		root.addView(Views.GAME, pkgv);
//		setTargetFPS(24);
	}	

	/**	These are all of the views for this game
	 * @author eettlin
	 *
	 */
	public enum Views{
		//		These are all of the views for this game
		INSTRUCTIONS, GAME, GAME_OVER, OTHER; 
	}

}
