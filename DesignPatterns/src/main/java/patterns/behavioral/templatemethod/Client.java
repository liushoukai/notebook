package patterns.behavioral.templatemethod;

/**
 * 
 * TEMPLATE METHOD
 * 
 * recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type
 * 
 * - 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中
 * - 子类可以在不改变算法的结构的情况下重新定义该算法的特定步骤
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Cooker c1 = new FishCooker();
		c1.cook();
		Cooker c2 = new ChickenCooker();
		c2.cook();
	}
	
}


