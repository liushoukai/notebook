package patterns.creational.factoryMethod;

/**
 * 
 * Factory Method
 * 
 * returning an implementation of an abstract/interface type
 * 
 * 理解1：一个接口有多个实现类，每个实现类由一个工厂类单独负责创建，所有的这些工厂类都实现了同一个工厂接口
 * 理解2：工厂方法仅仅指一个方法，该方法返回一个其他类的实例，并且只能通过子类方法重写来改变返回值
 * 
 * 
 * 1.工厂方法提供创建类实例的接口
 * 2.保留初始化哪一个类的控制
 * 
 * - Collection interface iterator()
 * 
 * @author LSK
 *
 */

public class Client {
	public static void main(String[] args) {
		LoggerFactory c = new ConsoleLoggerFactory();
		// getLogger()即就是工厂方法
		Logger logger = c.getLogger();
		logger.info("hello");
	}
}
