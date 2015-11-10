package patterns.behavioral.state;

public class HappyState implements EmotionalState {

	@Override
	public String sayHello() {
		return "Bye, friend!";
	}

	@Override
	public String sayGoodbye() {
		return "Hello, friend!";
	}

}
