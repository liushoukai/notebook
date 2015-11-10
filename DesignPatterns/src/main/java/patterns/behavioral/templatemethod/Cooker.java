package patterns.behavioral.templatemethod;

public abstract class Cooker {
	
	// template method
	public final void cook() {
		firstStep();
		secondStep();
	}
	
	protected abstract void firstStep();
	protected abstract void secondStep();
	
}
