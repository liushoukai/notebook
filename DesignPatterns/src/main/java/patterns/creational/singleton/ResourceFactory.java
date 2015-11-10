package patterns.creational.singleton;

/**
 * 延迟初始化占位类模式,JVM将推迟ResourceHolder的初始化操作
 */
public class ResourceFactory {
	private static class ResourceHolder {
		public static Resource resource = new Resource();
	}

	public static Resource getResource() {
		return ResourceHolder.resource;
	}
}

class Resource {
	// Singleton
}
