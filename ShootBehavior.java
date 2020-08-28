/**
 * This class inherits from the OffenceBehavior interface and contains the method for shooting the puck
 * @author Cole
 *
 */
public class ShootBehavior implements OffenceBehavior {
	@Override
	public String play() {
		return "shoots at the goal";
	}
}
