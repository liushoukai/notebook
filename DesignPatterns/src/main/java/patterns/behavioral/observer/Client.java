package patterns.behavioral.observer;

/**
 * 
 * OBSERVER
 * 
 * invokes a method on an instance of another abstract/interface type, depending on own state
 * 
 * - 定义对象之间的一对多的依赖关系，当一个对象的状态发生改变时，所有依赖它的对象都得到通知并自动更新
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.attach(new Observer1());
		subject.attach(new Observer2());
		subject.inform();
	}

}

class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("ob1 stop playing");
	}
	
}

class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("ob2 stop playing");
	}
	
}

