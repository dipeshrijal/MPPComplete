package playground.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dipesh", "Jane", "John", "Doe");
		
		final Optional<String> str = names.stream().filter(n -> n.startsWith("D")).findAny();
		
//		System.out.println(str.orElse(null));
		
		str.ifPresent(s -> System.out.println(s));
	}

}
