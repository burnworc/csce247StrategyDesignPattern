/**
 * This class inherits from the interfaces DefenceBehavior and OffenceBehavior and contains the various return statements for different blocking actions
 * @author Cole
 *
 */
import java.util.Random;
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
	@Override
	public String play() {
		Random r = new Random();
		int choice = r.nextInt(4);//Four numbers for the four choices available to play
		if(choice == 0) {
			return "blocks puck with stick";
		}
		else if(choice == 1) {
			return "blocks puck with knee pads";
		}
		else if(choice == 2) {
			return "hand blocks the puck";
		}
		else {
			return "catches the puck";
		}
	}
}
