package patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Adapter JDK Example
 * 
 * java.util.Arrays#asList()
 * java.io.InputStreamReader(InputStream) (returns a Reader)
 * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 * javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()
 * 
 * @author LSK
 *
 */
public class JdkExample {

	public static void main(String[] args) {
		String[] arr = new String[] {"apple", "pear"};
		List<String> fruits = Arrays.asList(arr);
		fruits.toString();
	}

}
