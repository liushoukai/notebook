package patterns.behavioral.command;

public class LunchCommand implements Command {
	
	private LunchReceiver lunch;
	
	public LunchCommand(LunchReceiver lunch) {
		this.lunch = lunch;
	}

	@Override
	public void execute() {
		lunch.makeLunch();
	}

}
