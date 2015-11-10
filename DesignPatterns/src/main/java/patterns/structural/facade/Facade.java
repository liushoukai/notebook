package patterns.structural.facade;

public class Facade {
	
	private SystemA a;
	private SystemB b;
	
	public Facade() {
		this.a = new SystemA();
		this.b = new SystemB();
	}
	
	public void operation() {
		this.a.operation();
		this.b.operation();
	}
}

class SystemA {
	public void operation() {
		System.out.println("B");
	}
}

class SystemB {
	public void operation() {
		System.out.println("B");
	}
}
