package patterns.creational.factoryMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Factory Method JDK Example
 * 
 * java.util.Calendar#getInstance()
 * java.util.ResourceBundle#getBundle()
 * java.text.NumberFormat#getInstance()
 * java.nio.charset.Charset#forName()
 * java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns singleton object per protocol)
 * 
 * @author LSK
 *
 */
public class JdkExample {
	public static void main(String[] args) {
		// iterator() method is a factory method
		List<String> list1 = new ArrayList<String>();
		Iterator<String> iter1 = list1.iterator();
		System.out.println(iter1.getClass().getName()); // java.util.ArrayList$Itr

		LinkedList<String> list2 = new LinkedList<String>();
		Iterator<String> iter2 = list2.iterator();
		System.out.println(iter2.getClass().getName()); // java.util.LinkedList$ListItr
	}
}
