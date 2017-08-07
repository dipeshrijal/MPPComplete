package april2017.problem3;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {

		// List<Person> sorted =
		// persons.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
		//
		// Person p = sorted.get(0);
		//
		// return p;

		return persons.stream().reduce((a, b) -> {
			if (a.getAge() > b.getAge()) {
				return a;
			} else {
				return b;
			}

		}).get();

	}

}
