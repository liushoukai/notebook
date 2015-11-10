package patterns.structural.proxy;

public class ProxyImage implements Image {
	
	private RealImage real;

	public ProxyImage(String fileName) {
		this.real = new RealImage(fileName);;
	}

	@Override
	public void display() {
		real.display();
	}

}

class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		System.out.println("Loading From Disk: " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

}
