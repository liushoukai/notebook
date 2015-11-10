package patterns.creational.builder;

/*
 * 创建者：类似建筑工人
 * - 实现Builder的接口以构造和装配该产品的各个部件
 * - 定义并明确它所创建的表示
 * - 提供一个检索产品的接口，如getResult返回Product
 */
public class ConcreteBuilder implements Builder {

	private PartA parta;
	private PartB partb;
	private PartC partc;

	@Override
	public void buildPartA() {
		this.parta = new PartA();
	}

	@Override
	public void buildPartB() {
		this.partb = new PartB();
	}

	@Override
	public void buildPartC() {
		this.partc = new PartC();
	}

	@Override
	public Product getResult() {
		Product p = new Product();
		p.setParta(parta);
		p.setPartb(partb);
		p.setPartc(partc);
		return p;
	}

}
