/**
 * The player class is an abstract class that contains all the attributes for the player. It contains the attributes for being on offence or defence, as well as constructors for the game.
 * @author Cole Burnworth
 *
 */
public abstract class Player {
	protected String name;
	private boolean offence = true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	/**
	 * Sets the name of the player and the behavior
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
		setDefenceBehavior();
		setOffenceBehavior();
	}
	public abstract void setDefenceBehavior();
	public abstract void setOffenceBehavior();
	/**
	 * Calls the method. For example, offencebehavior and defencebehavior depending on if you are on offence or defence.
	 * @return returns the method for offence or defence.
	 */
	public String play() {
		if(offence) {
			return this.offenceBehavior.play();
		}
		else {
			return this.defenceBehavior.play();
		}
	}
	/**
	 * Creates the method if a turnover occurs, switches from offence to defence or vice versa.
	 */
	public void turnover() {
		this.offence = false;
	}
}
