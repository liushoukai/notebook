package patterns.creational.builder;

public class Product {

	private PartA parta;
	private PartB partb;
	private PartC partc;

	public PartA getParta() {
		return parta;
	}

	public void setParta(PartA parta) {
		this.parta = parta;
	}

	public PartB getPartb() {
		return partb;
	}

	public void setPartb(PartB partb) {
		this.partb = partb;
	}

	public PartC getPartc() {
		return partc;
	}

	public void setPartc(PartC partc) {
		this.partc = partc;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "\n" + this.parta + "\n" + this.partb + "\n" + this.partc;
	}

}
