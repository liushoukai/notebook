package patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	
	private Map<String, Boolean> map = new HashMap<String, Boolean>();
	
	public boolean get(String key) {
		return this.map.get(key);
	}
	
	public void put(String key, Boolean value) {
		map.put(key, value);
	}

}
