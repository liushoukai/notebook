package patterns.creational.prototype;

import java.util.concurrent.TimeUnit;

/**
 * PROTOTYPE
 * 
 * returning a different instance of itself with the same properties
 * 
 * Prototype创建一个不同于原始对象的克隆对象，新对象与原对象具有相同的状态属性，
 * 新对象创建之后可能发生状态属性的变化，可以看做先复制原型得到克隆对象后再修改克隆对象的属性
 * 
 * @应用场景
 * 1、在循环体中创建对象时，使用原型模式比使用构造函数创建对象效率更高
 * 2、当创建的多个实例差别很小的时候，再去每次手工初始化会特别低效
 * 3、类是在运行时被动态载入的
 * 
 * @Benefits
 * - 克隆对象性能比创建新对象性能更高，注意必须采用深复制
 * - 原型对象可以在程序运行中的任何时刻被创建
 * 
 * @Comparison
 * - 工厂方法：关注于创建新的并且各不相同对象实例
 * - 原型：关注于创建多个状态属性差别不大的对象实例
 * - 抽象工厂：关注于创建一组相互依赖的对象实例
 * - 建造者：关注于创建对象实例过程的控制上
 * 
 * @author Kay
 * 
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Prototype p = new Prototype(0);
		for (int i=0; i<1000; i++) {
			Prototype tmp = (Prototype)p.clone();
			tmp.setId(i);
			//Prototype tmp = new Prototype(i);
		}
		long end = System.currentTimeMillis();
		System.out.printf("Time Cost: %sms", end -start);
	}
	
}

class Prototype implements Cloneable {
	private int id;

	public Prototype(int id) {
		this.id = id;
		try {
			TimeUnit.MILLISECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}


