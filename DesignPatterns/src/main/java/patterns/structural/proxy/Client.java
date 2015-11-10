package patterns.structural.proxy;

/**
 * 
 * PROXY
 * 
 * returns an implementation of given abstract/interface type which in turn
 * delegates/uses a different implementation of given abstract/interface type
 * 
 * 代理模式与适配器模式的区别：
 * 	     适配器为它所适配的对象提供一个不同的接口
 *    代理提供了与它的实体相同的接口
 * 代理模式与装饰着模式的区别：
 *    实现部分相似，但装饰者模式为对象添加功能，而代理模式控制对象的访问
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display();

	}

}
