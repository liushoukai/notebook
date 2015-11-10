package patterns.behavioral.visitor;

/**
 * 
 * VISITOR 访问者模式
 * 
 * recognizeable by two different abstract/interface types which has methods definied which takes each the other abstract/interface type; 
 * the one actually calls the method of the other and the other executes the desired strategy on it
 * 
 * - 用于简化对一组相关联对象的操作
 * 
 * @author LSK
 *
 */
public class Client {
	public static void main(String[] args) {
		
		Book book = new Book(30.50, 1);
		Pencil pencil = new Pencil(3.50, 5);
		
		ShoppingCartVisitorImpl scv = new ShoppingCartVisitorImpl();
		scv.accept(book);
		scv.accept(pencil);
		System.out.printf("Total price: %.2f", scv.getTotal());
		
	}
}
