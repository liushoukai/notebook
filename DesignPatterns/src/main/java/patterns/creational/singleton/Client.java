package patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SINGLETON
 * 
 * returning the same instance (usually of itself) everytime
 * 
 * 1.利用枚举元素的单例特性
 * 2.延迟初始化占位类模式
 * 3.使用锁机制
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i=0; i<100; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(ResourceFactory.getResource());
					System.out.println(SingletonEnum.INSTANCE.getProperty());
					System.out.println(Singleton.getInstance());
				}
			});
		}
		executor.shutdown();
	}
	
}
