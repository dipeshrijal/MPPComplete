package playground.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Dipesh", "Rijal"));
		persons.add(new Person("John", "Doe"));
		persons.add(new Person("Jane", "Doe"));

		// persons.forEach(p -> System.out.println(p));

		persons.forEach(System.out::println);

		// Collections.sort(persons, new MyComparator());

		// Collections.sort(persons, (e1, e2) ->
		// e1.getFirstName().compareTo(e2.getFirstName()));

		persons.sort((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));

		System.out.println("---------------After Sorting----------------");
		persons.forEach(p -> System.out.println(p));

	}

}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
