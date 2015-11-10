package patterns.behavioral.state;

public class Person implements EmotionalState {

	private EmotionalState emotionalState;

	public Person(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	public EmotionalState getEmotionalState() {
		return emotionalState;
	}

	public void setEmotionalState(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	@Override
	public String sayHello() {
		return emotionalState.sayHello();
	}

	@Override
	public String sayGoodbye() {
		return emotionalState.sayGoodbye();
	}

}
