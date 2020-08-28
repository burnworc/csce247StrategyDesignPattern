/**
 * This class is for the position of Forward, and contains all the attributes relating to the forward position. Inherits from base class Player
 * @author Cole
 *
 */
import java.util.Random;
public class Forward extends Player {
	public Forward(String name) {
		super(name);
	}
	/**
	 * Sets the Defence Behavior to a random chasePuckBehavior or a BlockBehavior
	 */
	@Override
	public void setDefenceBehavior() {
		Random r = new Random();
		int rand = r.nextInt(2);
		if(rand == 1) {
			this.defenceBehavior = new BlockBehavior();
		}
		else {
			this.defenceBehavior = new ChasePuckBehavior();
		}
	}
	@Override
	public void setOffenceBehavior() {
		Random r = new Random();
		int rand = r.nextInt(2);
		if(rand == 1) {
			this.offenceBehavior = new ShootBehavior();
		}
		else {
			this.offenceBehavior = new PassBehavior();
		}
	}
	/**
	 * toString method to display that a person plays the position forward.
	 */
	@Override
	public String toString() {
		return name + " plays the position: Forward";
	}
	
}
