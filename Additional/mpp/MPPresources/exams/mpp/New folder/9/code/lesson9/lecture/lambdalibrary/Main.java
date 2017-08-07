package lesson9.lecture.lambdalibrary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//load up some test data
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto", "94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "1000 N 4th", "Fairfield", "52557");
		
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6);

		//in-class exercise 1
		//get all names of customers whose city of residence begins 
		//with "Ma", in sorted order
		Predicate<Customer> p = x -> x.getCity().startsWith("Ma");
		Function<Customer, String> f = x -> x.getName();
		class MyFunction implements Function<Customer, String>{

			@Override
			public String apply(Customer x) {
				return x.getName();
			}
			
		}
		List<String> names = list.stream()
								 .filter(x -> x.getCity().startsWith("Ma"))
								 .map(x -> x.getName())
								 .sorted()
								 .collect(Collectors.toList());
		System.out.println(names);
		System.out.println("--------");
		System.out.println(LambdaLibrary.F1.apply(list, "Ma"));
		//in-class exercise 2
		//get all customers who live in Fairfield and sort by their name in descending order
		Comparator<Customer> comparator = (c1, c2) -> c2.getName().compareTo(c1.getName());
		Function<Customer, String> f1 = c -> c.getName();
		Comparator<Customer> comparator1 = Comparator.comparing(f1).reversed();
		
		List<Customer> returnList = list.stream()
										.filter(x -> "Fairfield".equals(x.getCity()))
										.sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
										.collect(Collectors.toList());
		System.out.println(returnList);
		System.out.println("****");
		System.out.println(LambdaLibrary.F2.apply(list, "Fairfield"));

	}

}
