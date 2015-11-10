package patterns.behavioral.templatemethod;

public class FishCooker extends Cooker {

	@Override
	protected void firstStep() {
		System.out.println("Step 1: buy fish.");
	}

	@Override
	protected void secondStep() {
		System.out.println("Step 2: cook fish.");
	}

}
