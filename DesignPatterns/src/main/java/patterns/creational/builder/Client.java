package patterns.creational.builder;

/**
 * 
 * Builder
 * 
 * returning the instance itself
 * 
 * 类似客户Client让建筑设计师Dirctor为自己设计房子，客户通过设计师决定房子需要哪些部分，
 * 最终设计师将客户确认的设计图纸交给设计工人进行施工，客户向建筑工人获取房子
 * - Builder对象提供给导向器的只是一个构造产品的抽象接口，隐藏了产品的内部结构和装配过程，
 * 因此在修改产品结构的时候只需要定义一个新的Builder对象
 * - Builder可以在Director导向器的控制下逐步确定产品的部分，仅当产品完成时Director才从
 * Builder对象中取回完整的产品，能够更精细的控制构建过程
 * 
 */
public class Client {

	public static void main(String[] args) {
		// 客户创建Director对象，并用它所想要的Builder对象进行配置
		Director director = new Director(new ConcreteBuilder());
		Product product = director.getBuilder().getResult();
		System.out.println(product.toString());
	}

}
