package labs.problem5;

import java.util.Arrays;

public class Problem2 {
	
	public static void main(String[] args) {
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
//		Lambdha
//		Arrays.sort(names, (x, y) -> x.compareToIgnoreCase(y));
//		Method Reference
		Arrays.sort(names, String::compareToIgnoreCase);
		
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		Arrays.stream(names).forEach(System.out::println);
	}

}
