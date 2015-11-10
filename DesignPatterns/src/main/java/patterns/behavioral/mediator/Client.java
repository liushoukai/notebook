package patterns.behavioral.mediator;

/**
 * Mediator
 * 
 * taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance
 * 
 * - 在不同对象之间作为一个公用的通讯媒介
 * - 避免多个对象之间直接交互所导致的耦合
 * - 机场的信号塔作为所有飞机间的通讯媒介
 * - 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式的相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 * - 中介者模式是将飞机之间直接通讯的职责转到通过塔台来实现飞机之间的通讯
 * - 观察者模式是所有飞机监听塔台的状态变化 
 * 
 * @author LSK
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		Mediator mediator = new Mediator();
		
		Colleague c1 = new ConcreteColleague1(mediator);
		Colleague c2 = new ConcreteColleague2(mediator);
		
		mediator.addColleague(c1);
		mediator.addColleague(c2);
		
		
		c1.send("C1 Send Message");
		c2.send("C2 Send Message");
	}
}

