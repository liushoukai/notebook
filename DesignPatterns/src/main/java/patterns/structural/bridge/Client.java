package patterns.structural.bridge;

/**
 * 
 * BRIDGE
 * 
 * taking an instance of different abstract/interface type and returning an implementation 
 * of own abstract/interface type which delegates/uses the given instance
 * 
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		Triangle a = new Triangle(new Red());
		a.draw();
		Rectangle b = new Rectangle(new Green());
		b.draw();
	}
}
