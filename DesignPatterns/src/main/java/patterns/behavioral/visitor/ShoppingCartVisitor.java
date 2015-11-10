package patterns.behavioral.visitor;

public interface ShoppingCartVisitor {
	public void accept(Book book);
	public void accept(Pencil pencil);
}
