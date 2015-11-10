package patterns.structural.composite;

import java.util.ArrayList;

public abstract class Component {
	
	public abstract void show();

	public void addComponent(Component component) {
		// 缺省操作
		throw new RuntimeException("not support yet");
	}

	public ArrayList<Component> getComponents() {
		// 缺省操作
		throw new RuntimeException("not support yet");
	}

}
