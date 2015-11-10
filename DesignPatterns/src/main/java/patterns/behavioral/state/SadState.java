package patterns.behavioral.state;

public class SadState implements EmotionalState {

	@Override
	public String sayHello() {
		return "Bye. Sniff, sniff.";
	}

	@Override
	public String sayGoodbye() {
		return "Hello. Sniff, sniff.";
	}

}
