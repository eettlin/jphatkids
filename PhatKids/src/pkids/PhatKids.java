package pkids;

import java.awt.Color;

import jgame.GRootContainer;
import jgame.Game;
import jgame.ImageCache;

public class PhatKids extends Game {

	public static void main(String[] args){
		ImageCache.create(PKids.class, "/pkids/rsc/");
		//Create the Pong game
		//Create an instance and assign to a variable
		//Type name = new Type()
		PKids p1 = new PKids();
		//Start the Pong game
		p1.startGame();
	}
	
	public void Pkids(){
		
		GRootContainer root = new GRootContainer(Color.RED );
		setRootContainer(root);
		PKidsGameView pgv = new PKidsGameView();
		GameOverView gov = new GameOverView();
		root.addView(Views.GAME, pgv);
		root.addView(Views.GAME_OVER, gov);

	}
	
	
	/**	These are all of the views for this game
	 * @author eettlin
	 *
	 */
	public enum Views{
//		These are all of the views for this game
		MENU, GAME, GAME_OVER, INSTRUCTIONS,OTHER; 
	}
	

}
