package patterns.structural.flyweight;

/**
 * 
 * FLYWEIGHT
 * 
 * recognizeable by creational methods returning a cached instance
 * 
 * - a bit like the "Multiton pattern" idea
 * 
 * - 执行时所需的状态必定是内部的或外部的
 * 
 * - internal state should be stored in the concrete flyweight
 * 
 * - external state should be passed by client
 * 
 * - Client只能从FlyweightFactory对象得到ConcreteFlyweight
 * 
 * - 最好使用Flyweight实现State和Strategy对象
 * 
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		Flyweight f1 = FlyweightFactory.getInstance().getFlyweight("adding");
		f1.cal(3, 4);
		Flyweight f2 = FlyweightFactory.getInstance().getFlyweight("multiplying");
		f2.cal(3, 4);
	}
}
