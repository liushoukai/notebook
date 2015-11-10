package patterns.structural.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * Decorator JDK Example
 * 
 * All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a
 * constructor taking an instance of same type. java.util.Collections, the
 * checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
 * javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper
 * 
 * @author LSK
 *
 */
public class JdkExample {
	
	private static final String FILE_PATH = "C:\\pet.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ObjectOutputStream与FileOutputStream实现了OutputStream接口，前者添加了额外的行为方法
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
		oos.writeObject(new Pet("Cute Pet"));
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
		System.out.println(ois.readObject());
		ois.close();
		
	}
}

class Pet implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

}
