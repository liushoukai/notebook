package patterns.behavioral.iterator;

/**
 * 
 * ITERATOR
 * 
 * sequentially returning instances of a different type from a queue
 * 
 * - 将对列表的遍历从列表对象中分离出来并放入一个迭代器对象中
 * 
 * @author LSK
 *
 */
public class Client {

	public static void main(String[] args) {
		Container<String> c = new ConcreteContainer();
		Iterator<String> iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
