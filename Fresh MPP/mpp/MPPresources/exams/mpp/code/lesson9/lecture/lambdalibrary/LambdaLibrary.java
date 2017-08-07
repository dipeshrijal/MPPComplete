package lesson9.lecture.lambdalibrary;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class LambdaLibrary {
	 /**
	  * Accepts list of customers and a search string <code>searchStr</code>.
	  * 
	  * Returns the names of those customers whose name begins with <code>searchStr</code>,
	  * in sorted order.
	  */
	
	 public static final BiFunction<List<Customer>, String, List<String>> F1 =
			 (list, startingLetter) -> {
				return  list.stream()
				 .filter(x -> x.getCity().startsWith(startingLetter))
				 .map(x -> x.getName())
				 .sorted()
				 .collect(Collectors.toList());
			 };
	
    public static final BiFunction<List<Customer>, String, List<Customer>> F2=
    		(list, city) -> {
    			return list.stream()
						.filter(x -> city.equals(x.getCity()))
						.sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
						.collect(Collectors.toList());
    		};
}
