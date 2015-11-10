package patterns.behavioral.visitor;

public class Pencil implements GoodsElement {

	private double price;
	private int amount;

	public Pencil(double price, int amount) {
		this.price = price;
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public void accept(ShoppingCartVisitor visitor) {
		visitor.accept(this);
	}

}
