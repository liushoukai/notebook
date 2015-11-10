package patterns.behavioral.templatemethod;

public class ChickenCooker extends Cooker {

	@Override
	protected void firstStep() {
		System.out.println("Step 1: buy chicken.");
	}

	@Override
	protected void secondStep() {
		System.out.println("Step 2: cook chicken.");
	}

}
