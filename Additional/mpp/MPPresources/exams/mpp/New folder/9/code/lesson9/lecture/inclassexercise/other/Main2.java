package lesson9.lecture.inclassexercise.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main2 {

	public static void main(String[] args) {
		//load up some test data
		List<Address> addresses = new ArrayList<Address>() {
			{
				add(new Address("101 S. Main", "Fairfield", "IA", "52556"));
				add(new Address("51 S. George", "Georgetown", "MI", "65434"));
				add(new Address("23 Headley Ave", "Seville", "Georgia", "41234"));
				add(new Address("1 N. Baton", "Baton Rouge", "LA", "33556"));
				add(new Address("5001 Venice Dr.", "Los Angeles", "CA", "93736"));
				add(new Address("1435 Channing Ave", "Palo Alto", "CA", "94301"));
				add(new Address("42 Dogwood Dr.", "Fairfield", "IA", "52556"));
				add(new Address("501 Central", "Mountain View", "CA", "94707"));
			}
		};
		List<Person> allPersons = new ArrayList<Person>() {
			{
				add(new Person("Joe", "Thomas", "641-445-2123", addresses.get(0)));
				add(new Person("Sandra", "Thomas", "641-445-2123", addresses.get(0)));
				add(new Person("Nirmal", "Pugh", "641-919-3223", addresses.get(1)));
				add(new Person("Andrew", "Cleveland", "976-445-2232", addresses.get(2)));
				add(new Person("Sarah", "Connor", "123-422-2663", addresses.get(3)));
			}
		};
		
		//Task:get full names of persons who live in Fairfield, 
		//in sorted order(sort by first name)
	
		//Step 1: create a pipeline to accomplish the task and test it 
		Predicate<Person> p = (Person person) -> person.getAddress().getCity().equals("Fairfield");
		Comparator<Person> comp = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> comp1 = Comparator.comparing( x -> x.getFirstName());
		List<String> names = allPersons.stream()
				  .filter((Person person) -> person.getAddress().getCity().equals("Fairfield"))
				  .sorted(Comparator.comparing( x -> x.getFirstName()))
				  .map(q->q.getFirstName() + " " + q.getLastName())
				  .collect(Collectors.toList());	  
		
		/* Step 2: transform the pipeline into a named lambda expression 
		 * and put it into your library */
		System.out.println(LambdaLibrary.BI.apply(allPersons, "Fairfield"));
	}

}
