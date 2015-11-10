package patterns.structural.bridge;

public class Red implements Color {

	@Override
	public String useColor() {
		return this.getClass().getSimpleName();
	}

}
