package playground;

import java.util.ArrayList;
import java.util.List;

public class FindLength {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("dipesh");
		words.add("rijal");
		words.add("john");
		words.add("jane");
		words.add("doe");
		
		// stream
		final long count = words.stream().filter(w -> w.length() >= 3).count();
		
		// parallel stream
		final long count1 = words.parallelStream().filter(w -> w.length() > 3).count();
		
		
		System.out.println(count1);
		
		System.out.println(count);
		
		System.out.println(words);
	}

}
