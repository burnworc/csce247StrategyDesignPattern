/**
 * This class contains all the attributes relating to the position: defencemen.
 * @author Cole
 *
 */
import java.util.Random;
public class Defenceman extends Player {
	public Defenceman(String name) {
		super(name);
	}
	/**
	 * Uses the random method to choose between passing and shooting. They will choose passing 9 out of 10 times.
	 */
	@Override
	public void setOffenceBehavior() {
		Random r = new Random();
		int rand = r.nextInt(9);//
		if(rand == 1) {
			this.offenceBehavior = new ShootBehavior();
		}
		else {
			this.offenceBehavior = new PassBehavior();
		}
	}
	/**
	 * Uses Random() method to randomly choose between setting the behavior to a chase puck behavior or block behavior.
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
	/**
	 * toString method for returning the position when calling the name of the player
	 */
	@Override
	public String toString() {
		return name + " plays the position: Defencemen";
	}
}
