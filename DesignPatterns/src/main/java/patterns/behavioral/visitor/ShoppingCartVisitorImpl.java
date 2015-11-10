package patterns.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	
	private double total;

	@Override
	public void accept(Book book) {
		total += book.getPrice() * book.getAmount();
	}

	@Override
	public void accept(Pencil pencil) {
		total += pencil.getPrice() * pencil.getAmount();
	}

	public double getTotal() {
		return total;
	}
	
}
