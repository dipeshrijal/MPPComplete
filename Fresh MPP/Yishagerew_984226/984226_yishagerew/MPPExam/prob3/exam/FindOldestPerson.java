package MPPExam.prob3.exam;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		//implement

		return persons.stream().reduce((a,b) -> a.getAge() > b.getAge()? a:b).get();
		//return null
	}
	
	
}
