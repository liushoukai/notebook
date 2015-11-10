package patterns.structural.composite;

public class Leaf extends Component {
	
	private String id;

	public Leaf(String id) {
		this.id = id;
	}

	@Override
	public void show() {
		System.out.println(this.id);
	}
	
}
