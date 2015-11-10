package patterns.structural.flyweight;

/**
 * 
 * FLYWEIGHT JDK EXAMPLE
 * 
 * @author LSK
 *
 */
public class JdkExample {
	
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(2);
		Integer i2 = Integer.valueOf(2);
		System.out.printf("JDK Flyweight: %s\n", i1 == i2);
	}
	
}
