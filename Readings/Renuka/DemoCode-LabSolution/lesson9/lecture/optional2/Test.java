package lesson9.lecture.optional2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("dog", "cat", "mouse");
		String max = words.stream().max(String::compareTo).get();
		System.out.println(max);
		Stream<String> stream = Stream.empty();
//		Stream<String> stream = Stream.of("dog", "cat", "mouse");
		// throws NoSuchElementException
//		System.out.println(stream.max(String::compareTo).get());
		Optional<String> str = stream.max(String::compareTo);
		
		
		System.out.println(str.orElse(null));
		
		str.ifPresent(s -> System.out.println(s));
		
		

	}

}
