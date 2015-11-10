package patterns.structural.facade;

/**
 * 
 * FACADE
 * 
 * internally uses instances of different independent abstract/interface types
 * 
 * 意图：为子系统中的一组接口提供一个一致的界面，Facade定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * classes 协作：客户程序通过发送请求给Facade的方式与子系统通讯，Facade将这些消息转发给适当的子系统对象。
 * 尽管是子系统中的有关对象在做实际工作，但Facade模式本身也必须将它的接口转换成子系统的接口
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade f = new Facade();
		f.operation();
	}
}
