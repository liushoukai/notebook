package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	public void inform() {
		
		for(Observer ob : observers) {
			ob.update();
		}
	}
	
	public void attach(Observer ob) {
		this.observers.add(ob);
	}
}
