package patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * java.util.Comparator#compare(), executed by among others Collections#sort().
 * javax.servlet.http.HttpServlet, the service() and all doXXX() methods take HttpServletRequest and HttpServletResponse and the implementor has to process them (and not to get hold of them as instance variables!).
 * javax.servlet.Filter#doFilter()
 * 
 * @author LSK
 *
 */
public class JdkExample {
	public static void main(String[] args) {
		
		List<People> list = Arrays.asList(new People[] {
			new People(25),
			new People(24),
			new People(21),
			new People(23)
		});
		
		// Comparator#compare()
		Collections.sort(list, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				return o1.getAge() - o2.getAge(); 
			}
			
		});
		
		System.out.println(list);
	}
}

class People {
	
	private int age;
	
	public People(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "People [age=" + age + "]";
	}

}
