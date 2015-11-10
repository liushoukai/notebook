package patterns.structural.adapter;

/**
 * 
 * Adapter
 * 
 * taking an instance of different abstract/interface type and returning an implementation of 
 * own/another abstract/interface type which decorates/overrides the given instance
 * 
 * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 * 
 * 业务细节接口需要调用业务无关的工具类接口，在确保不修改原接口实现的基础上，通过增加适配器类保证两者协同工作，
 * 
 * 为复用而设计的工具箱类不能够复用的原因仅仅是因为它的接口与专业应用领域所需要的接口不匹
 * 
 * #适用性
 * 你想使用一个已经存在的类，而它的接口不符合你的要求
 * 你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类协同工作
 * 你想使用一些已经存在的子类，但是不可能对每一个都进行子类化匹配它们的接口。对象适配器可以适配它的父类接口
 * 
 * ## 参与者
 * Target     	定义Client使用的与特定领域相关的接口
 * Client		与符合Target接口的对象协同
 * Adaptee		定义一个已经存在的接口，这个接口需要适配
 * Adapter		对Adaptee的接口与target接口进行适配
 * 
 * ## 效果
 * 类适配器和对象适配器有不同的权衡
 * 类适配器：
 * - 用一个具体的Adapter类对Adaptee和Target进行匹配。结果当我们想要匹配一个类及其它所有子类时，类Adapter将不能胜任
 * - 使得Adapter可以重新定义Adaptee的部分行为，因为Adapter是Adaptee的一个子类
 * - 仅仅引入了一个对象，并不需要额外的指针间接得到adaptee
 * 对象适配：
 * - 允许一个Adapter与多个Adaptee
 * - 使得重定义Adaptee的行为比较群难
 * 
 * 当现有类的方法无法满足需要时，例如有一个摄氏温度计可以测量温度，但是我想知道华氏温度，
 * 通过新增温度计的接口，在接口中加入需要的方法，在接口的实现类中持有摄氏温度计的引用
 * 
 * 已有类方法返回的结果需要做一定转换才能供系统中的其他类使用，
 * 添加一个适配器接口模拟目标类需要的方法，在接口的实现类中，
 * 通过持有已有类的实例，在接口方法中做一定的转换得到需要的功能
 * 
 * java.io.InputStreamReader(InputStream) (returns a Reader)
 * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 * 
 * @author LSK
 */
public class Client {

	public static void main(String[] args) {
		ThermometerAdapter tr = new ThermometerAdapterImpl(new CelciusThermometer());
		tr.setCelsius(16);
		System.out.printf("Celcius: %3.1f, Fahrenheit: %3.1f\n", tr.getCelsius(), tr.getFahrenheit());
	}

}
