package meili.problem1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

//	public static final String IMPLEMENT = "IMPLEMENT";
	
	public static final TriFunction<List<LibraryMember>, String, Character, String> IMPLEMENT = 
			(list, state, c) -> {
				return list.stream()
				.filter(s -> s.getAddress().getState().equals(state))
				.filter(s -> s.getFirstName().charAt(0) > c)
				.sorted(Comparator.comparing(LibraryMember::getAge))
				.map(s -> s.getFirstName() + " " + s.getLastName())
				.collect(Collectors.joining(""));
			};
	
	
	
}
