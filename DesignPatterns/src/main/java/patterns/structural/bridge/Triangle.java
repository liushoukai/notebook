package patterns.structural.bridge;


public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	protected void draw() {
		System.out.printf("Draw %s with %s color\n", this.getClass().getSimpleName(), this.color.useColor());
	}

}
