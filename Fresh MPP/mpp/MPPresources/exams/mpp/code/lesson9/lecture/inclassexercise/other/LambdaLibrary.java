package lesson9.lecture.inclassexercise.other;

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
	 public static final BiFunction<List<Person>, String, List<String>> BI 
	 	= (list, city) -> list.stream()
		  .filter((Person person) -> person.getAddress().getCity().equals(city))
		  .sorted(Comparator.comparing( x -> x.getFirstName()))
		  .map(q->q.getFirstName() + " " + q.getLastName())
		  .collect(Collectors.toList());
	 
}
