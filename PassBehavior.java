/**
 * This class inherits from the interface OffenceBehavior and contains the method for passing the puck
 * @author Cole
 *
 */
public class PassBehavior implements OffenceBehavior {
	@Override
	public String play() {
		return "passes to a forward";
	}
}
