/**
 * 
 */
/**
 * @author sshad
 *
 */
package Problem1.Exam.PartC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
public class PartC {
   
   
//(Integer key,String value) ->System.out.println("Key:"+ key+" Value:"+ value)
   // name and type of lambda goes here
   
 
	
	// representing lambda as a method reference
   
		
	//representing lambda as a static nested class
	
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		Map<Integer,String> map = new HashMap<>();
	       map.put(1, "A");
	       map.put(2, "B");
	       map.put(3, "C");
//		   map.forEach(cal1);// Use lambda to display all items
//		   map.forEach(cal2);// Use method reference to display all items
//		   map.forEach(cal3);// Use static nested class to display all items
	}
	public static void main(String[] args) {
		PartC p = new PartC();
		p.evaluator();
	}
}