package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
	
	//SINGLETON PATTERN
	private static volatile FlyweightFactory me;
	
	public static FlyweightFactory getInstance() {
		synchronized(FlyweightFactory.class) {
			if (me == null) {
				me = new FlyweightFactory();
			}
		}
		return me;
	}
	
	public Flyweight getFlyweight(String operation) {
		Flyweight flyweight = null;
		if (flyweights.containsKey(operation)) {
			flyweight = flyweights.get(operation);
		} else {
			if ("adding".equals(operation)) {
				flyweight = new FlyweightAdder();
			} else if ("multiplying".equals(operation)) {
				flyweight = new FlyweightMultiplier();
			}
		}
		return flyweight;
	}
	
}

class FlyweightAdder implements Flyweight {
	
	private String operation;//internal state

	public FlyweightAdder() {
		this.operation = "adding";
	}

	@Override
	public void cal(int a, int b) {//external state
		System.out.println(operation + " " + a + " and " + b + ": " + (a + b));
	}

}

class FlyweightMultiplier implements Flyweight {
	
	private String operation;//internal state

	public FlyweightMultiplier() {
		this.operation = "multiplying";
	}

	@Override
	public void cal(int a, int b) {//external state
		System.out.println(operation + " " + a + " and " + b + ": " + (a * b));
	}

}
