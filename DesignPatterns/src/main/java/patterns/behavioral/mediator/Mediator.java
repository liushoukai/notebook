package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Colleague> colleagues = new ArrayList<Colleague>();

	// 塔台添加飞机
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	// 塔台向飞机发送消息
	public void send(String message, Colleague originator) {
		// let all other screens know that this screen has changed
		for (Colleague colleague : colleagues) {
			// don't tell ourselves
			if (colleague != originator) {
				colleague.receive(message);
			}
		}
	}
}
