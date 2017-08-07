package prob3.exam;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		Person p = null;
		try {
			// generating stream with terminal operation Reduce
			p = persons.stream()
			  .reduce((a, b) -> {
			   if (a.getAge() > b.getAge())
					return a;
			   else
					return b;
			})
			.get();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return p;

	}

}
