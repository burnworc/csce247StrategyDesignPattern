/**
 * This class inherits from the parent interface and uses random to choose between three defensive moves.
 * @author Cole
 *
 */
import java.util.Random;
public class BlockBehavior implements DefenceBehavior {
	@Override
	public String play() {
		Random r = new Random();
		int choice = r.nextInt(3); //Picks and number 0,1 or 2
		if(choice == 0) { //If the choice is 0
			return "checks player with puck";
		}
		else if(choice == 1) {//If the choice is 1
			return "blocks player from passing";
		}
		else {//If the choice is 2
			return "blocks player from shooting";
		}
	}
}
