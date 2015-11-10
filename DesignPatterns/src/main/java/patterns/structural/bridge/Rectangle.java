package patterns.structural.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	protected void draw() {
		System.out.printf("Draw %s with %s color\n", this.getClass().getSimpleName(), this.color.useColor());
	}

}
