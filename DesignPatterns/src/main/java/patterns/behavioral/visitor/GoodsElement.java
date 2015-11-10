package patterns.behavioral.visitor;

/**
 * 
 * 
 * 
 * @author LSK
 *
 */
public interface GoodsElement {
	public void accept(ShoppingCartVisitor visitor);
}
