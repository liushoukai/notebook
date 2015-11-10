package patterns.behavioral.mediator;

public class ConcreteColleague2 implements Colleague {

	private Mediator mediator;
	
	public ConcreteColleague2(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void receive(String message) {
		System.out.printf("Colleague %s Received: %s \n", this.getClass().getName(), message);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

}
