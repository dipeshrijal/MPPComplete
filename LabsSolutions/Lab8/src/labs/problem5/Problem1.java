package labs.problem5;

import java.util.Arrays;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		
		
		// printing using lambda
		
		fruits.forEach(f -> System.out.println(f));
		
		
		// printing using method reference
		System.out.println("===================================================");
		
		
		fruits.forEach(System.out::println);
	}

}
