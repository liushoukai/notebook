package patterns.creational.abstractFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

/**
 * 
 * Abstract Factory JDK Example
 * 
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
 * javax.xml.transform.TransformerFactory#newInstance()
 * javax.xml.xpath.XPathFactory#newInstance()
 *   
 * @author LSK
 *
 */
public class JdkExample {

	public static void main(String[] args) throws ParserConfigurationException {
		// DocumentBuilderFactory is an abstract factory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		doc.toString();
	}

}
