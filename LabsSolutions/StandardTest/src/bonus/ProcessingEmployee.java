package bonus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcessingEmployee {
	public static void main(String[] args) {
		// 1. Initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		List<Employee> list = Arrays.asList(employees);

		// 1. display all Employees using forEach [ 1 Points ]
		list.stream().forEach(System.out::println);

		System.out.println(
				"2. Display Employees with salaries in the range $4000-$6000 sorted into ascending order by salary [ 3 Points ]");

		list.stream().sorted(Comparator.comparing(Employee::getSalary))
				.filter(e -> e.getSalary() >= 4000 && e.getSalary() <= 6000).forEach(System.out::println);

		System.out.println("3. Comparator for comparing Employees by first name then last name [ 3 Points]");

		list.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
				.forEach(System.out::println);

		System.out.println("4. display unique employee last names in sorted order [ 3 Points ]");

		list.stream().map(Employee::getLastName).sorted().distinct().forEach(System.out::println);

		System.out.println(
				"5. group Employees by department to Map with Department name as a key and List of employees as values and print the result [ 4 Points ]");
		// 5. group Employees by department to Map with Department name as a key and
		// List of
		// employees as values and print the result
		 Map<String, List<Employee>> employee = list.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment));
		 
		 

		 System.out.println(employee);

		// 6.Count number of Employees in each department to map with
		// Department as key and department count as value and print the result [ 3
		// Points ]
		System.out.println(
				"6.Count number of Employees in each department to map with Department as key and department count as value and print the result [ 3 Points ]");
		
		Map<String, Long> employee1 = list.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment,  Collectors.counting()));
		
		System.out.println(employee1);

		System.out.println("7.calculate sum of Employee salaries with Stream reduce method [ 3 Points ]");

		double sum = list.stream().map(Employee::getSalary).reduce(0.0, (x, y) -> x + y);

		System.out.println(sum);

		System.out.println(
				"8. Find an employee who has the first name \"Andy\" in the list, check null using Optional isPresent() or orElse to avoid NullPointerException [ 4 Points ]");

		Optional<String> andy = list.stream().map(e -> e.getFirstName()).filter(e -> e.equals("Andy")).findFirst();

		System.out.println(andy.orElse(null));

		System.out.println(
				"9. Create an object using ClassName::new for the Employee class by defining your own Interface [ 3 Points ]");

		QuadFunction<String, String, Double, String, Employee> emp = Employee::new;

		Employee empp = emp.apply("Dipesh", "Rijal", 30000.0, "Manager");

		/*
		 * 10. Create a lambda library for the given query and test it // Hint : Lambda
		 * Library, identify the parameters that are combined together in your pipeline,
		 * and consider those to be arguments for some kind of Java function-type
		 * interface [3 Points]
		 */
		
		 List<String> l2 = list.stream().filter((x) ->
		 x.getLastName().startsWith("I")).peek(System.out::println)
		 .map(Employee::getLastName).sorted().collect(Collectors.toList());
		 
		 System.out.println(l2);

	} // end main
}
