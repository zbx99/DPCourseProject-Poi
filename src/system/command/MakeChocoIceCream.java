package system.command;
/**
 * 制作巧克力冰激凌
 * @author Administrator
 * @version 0.0.1
 */
public class MakeChocoIceCream implements MakeIceCream{
	public void execute() {
		System.out.println(this.getClass().getSimpleName()
				+ ": ()" + "execute method is called: executing..");
		System.out.println("ChocolateIceCream is Created!");
	}
}
