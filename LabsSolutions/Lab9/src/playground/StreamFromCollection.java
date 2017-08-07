package playground;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamFromCollection {
	
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		names.add("dipesh");
		names.add("rijal");
		names.add("ken");
		
		
		Stream<String> sequentialStream = names.stream();
		
		sequentialStream.filter(name -> name.startsWith("d")).forEach(System.out::println);
		
	}

}
