package pkids;

import java.awt.Color;
import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;

public class PhatKids extends Game {


	public static void main(String[] args) {
		ImageCache.create(PhatKids.class, "/pkids/rsc/");
		//Create an instance and assign to a variable
		PhatKids pk1 = new PhatKids();
		//Start the PhatKids game
		pk1.startGame();
	}	

	public PhatKids(){
		
		GRootContainer root = new GRootContainer(Color.BLUE );
		setRootContainer(root);
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
