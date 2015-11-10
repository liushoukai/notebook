package patterns.behavioral.templatemethod;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * TEMPLATE METHOD JDK EXAMPLE
 * 
 * All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
 * All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
 * javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.
 * 
 * @author LSK
 *
 */
public class JdkExample {

	public static void main(String[] args) throws IOException {
		InputStream is = new ByteArrayInputStream("Hello World".getBytes());
		byte[] buffer = new byte[1024];
		// template method
		is.read(buffer, 0, buffer.length);
	}

}
