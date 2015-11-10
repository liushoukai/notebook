package patterns.structural.decorator;

/**
 * 
 * Decorator
 *   
 * taking an instance of same abstract/interface type which adds additional behaviour
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Component c = new Decorator(new ConcreteComponent());
		c.operation();
	}

}
