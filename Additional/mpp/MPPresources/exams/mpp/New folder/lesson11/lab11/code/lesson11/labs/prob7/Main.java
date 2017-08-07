package lesson11.labs.prob7;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		emps.reduce((e1,e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
		emps.reduce(BinaryOperator.maxBy(Comparator.comparing(e->e.getSalary())));
		  System.out.println(emps
				    .filter(e -> (e.getSalary() > 100000))
				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.joining(", ")));
	}
	
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
