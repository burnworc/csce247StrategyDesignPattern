/**
 * This class contains the attributes for the goalie position. It extends from Player class to set the offence and defence behavior.
 * @author Cole Burnworth
 *
 */
public class Goalie extends Player {
	public Goalie(String name) {
		super(name); 
	}
	/**
	 * Sets the defence behavior to be set to new BlockGoalBehavior
	 */
	@Override
	public void setDefenceBehavior() {
		this.defenceBehavior = new BlockGoalBehavior();
	}
	/**
	 * Sets the offence behavior to the new BlockGoalBehavior
	 */
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}
	/**
	 * returns the statement plays the position: Goalie, when it is called.
	 */
	@Override
	public String toString() {
		return name + " plays the position: Goalie";
	}
}
