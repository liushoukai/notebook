package patterns.structural.decorator;

public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("Concrete Component operation");
	}

}
