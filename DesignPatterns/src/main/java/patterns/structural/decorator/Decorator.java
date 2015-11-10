package patterns.structural.decorator;

public class Decorator implements Component {
	
	private Component c;
	
	public Decorator(Component c) {
		this.c = c;
	}

	@Override
	public void operation() {
		System.out.println("Decorator additional behaviour.");
		c.operation();
	}

}
