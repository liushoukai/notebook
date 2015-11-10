package patterns.behavioral.strategy;
/**
 * STRATEGY 策略模式
 * 
 * recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of 
 * a different abstract/interface type which has been passed-in as method argument into the strategy implementation
 * 
 * - 当特定任务有多种处理算法时，希望在运行时由调用者决定具体使用何种算法
 * 
 * -- 模式关系 --
 * Strategy vs State 
 * 策略模式Context对象不持有Strategy接口实例的引用，而是通过方法参数的形式接收Strategy
 * 状态模式Context对象持有一个State接口实例的引用
 *    
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.pay(new CreditCardStrategy());
		cart.pay(new PaypalStrategy());
	}
}

class ShoppingCart {
	
	public void pay(PaymentStrategy strategy) {
		strategy.pay();
	}
	
}

class CreditCardStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println(" paid using credit card ");
	}

}

class PaypalStrategy implements PaymentStrategy {

	@Override
	public void pay() {
		System.out.println(" paid using Paypal.");
	}

}
