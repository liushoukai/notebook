package patterns.structural.bridge;

public class Green implements Color {

	@Override
	public String useColor() {
		return this.getClass().getSimpleName();
	}

}
