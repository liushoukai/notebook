package patterns.behavioral.command;

/**
 * 
 * COMMAND
 * 
 * in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type
 * which has been encapsulated by the command implementation during its creation
 * 
 * - Command模式将命令的调用者与接受者解耦
 * - 调用者持有命令的引用，具体命名持有接受者的引用
 * 
 * Invoker
 * Receiver
 * Command
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Command c = new LunchCommand(new LunchReceiver());
		Invoker i = new Invoker(c);
		i.invoke();
	}

}
