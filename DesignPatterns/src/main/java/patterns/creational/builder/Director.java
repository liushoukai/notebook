package patterns.creational.builder;

/*
 * 导向器:类似建筑设计师
 */
public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
		this.builder.buildPartA();
		this.builder.buildPartB();
		this.builder.buildPartC();
	}

	public Builder getBuilder() {
		return this.builder;
	}
}
