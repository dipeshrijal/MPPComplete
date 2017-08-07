package playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {

	public static void main(String[] args) {

		List<String> color = Arrays.asList("red", "blue", "black", "yellow", "brown", "pink", "green");
		List<String> languages = Arrays.asList("java", "php", "javascript", "python", "ruby", "c", "c++");

		Stream<String> res = Stream.concat(color.stream(), languages.stream());

		res.forEach(System.out::println);
		
		// concat after operation
		
		System.out.println("==================concat after operation===================================");
		
		
		Stream<String> stt = Stream.concat(color.stream().filter(c -> c.startsWith("b")), languages.stream());
		
		stt.forEach(System.out::println);
		

	}

}
