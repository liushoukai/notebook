package patterns.creational.abstractFactory;

import javax.xml.parsers.ParserConfigurationException;

/**
 * 
 * Abstract Factory
 * 
 * returning the factory itself which in turn can be used to create another abstract/interface type
 * 
 * 工厂方法是由子类自行决定实例化那个类
 * 抽象工厂是自己决定实例化哪个类
 * 
 * 创建一组相关的类型，例如创建主题，主题是由Button与Label构成的
 * 因此创建浅色主题与深色主题的工厂都包含创建Button和Label的方法
 * 
 * @author LSK
 *
 */
public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParserConfigurationException {
		// 抽象工厂需要返回具体的深色主题工厂，极端情况是只有一种主题
		AbstractThemeFactory fac = AbstractThemeFactory.newInstance("dark");
		Button btn = fac.newButton();
		Panel pnl = fac.newPanel();
	}

}
