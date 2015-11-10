package patterns.behavioral.state;

/**
 * 
 * STATE
 * 
 * recognizeable by behavioral methods which changes its behaviour depending on
 * the instance's state which can be controlled externally
 * 
 * - 电视遥控器，如果状态是开，则执行打开电视操作；如果状态是关闭，则执行关闭电视操作
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Person person = new Person(new HappyState());
		System.out.println("Hello in happy state: " + person.sayHello());
		System.out.println("Goodbye in happy state: " + person.sayGoodbye());

		person.setEmotionalState(new SadState());
		System.out.println("Hello in sad state: " + person.sayHello());
		System.out.println("Goodbye in sad state: " + person.sayGoodbye());

	}

}
