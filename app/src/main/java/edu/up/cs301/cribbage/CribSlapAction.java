package edu.up.cs301.cribbage;

import edu.up.cs301.game.GameFramework.GamePlayer;

/**
 * A SJSlapAction is an action that represents slapping the card that is
 * on the "up" pile.
 * 
 * @author Steven R. Vegdahl
 * @version 31 July 2002
 */
public class CribSlapAction extends CribMoveAction
{
	private static final long serialVersionUID = 2134321631283669359L;

	/**
     * Constructor for the SJSlapMoveAction class.
     * 
     * @param player  the player making the move
     */
    public CribSlapAction(GamePlayer player)
    {
        // initialize the source with the superclass constructor
        super(player);
    }

    /**
	 * @return whether this action is a "slap" move
     */
    public boolean isSlap() {
        return true;
    }
    
}
