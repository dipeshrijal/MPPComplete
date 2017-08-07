package labs.problem10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only male canditates

		System.out.println("------------------------------Male---------------------------\n");

		Arrays.stream(list).filter(human -> human.getGender().equals("Male")).forEach(System.out::println);

		// Query 2 : add some more objects to the list, and print the count of female
		// candidates whose age is greater than 30

		Human[] list1 = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male"),
				new Human("Dipesh", 26, "Male"), new Human("Alien", 45, "Female"), new Human("Amina", 50, "Female") };

		System.out.println("\n-----------------------------Female greater than 30------------\n");

		final long total = Arrays.stream(list1).filter(human -> human.getGender().equals("Female"))
				.filter(human -> human.getAge() > 30).count();

		System.out.println("Total female greater than 30 = " + total);

		// Query 3 : Practice for method reference Classname::new - Cretae an objecy by
		// choosing suitable Interface to the specified constructors(Totally 3
		// constuctors) and print the object status

		Function<String, Human> person1 = Human::new;
		Human p1 = person1.apply("Dipesh");
		System.out.println("\n single constructor => " + p1 + "\n");

		BiFunction<String, Integer, Human> person2 = Human::new;
		Human p2 = person2.apply("Dipesh", 26);
		System.out.println("\n Double constructor => " + p2 + "\n");

		TriFunction<String, Integer, String, Human> person3 = Human::new;
		Human p3 = person3.apply("Dipesh", 26, "Male");
		System.out.println("\n Triple constructor => " + p3 + "\n");

		// Query 4 : convert your Human array into ArrayList of Human by creating a
		// static method, decide your arguments and return type

		List<Human> col1 = arrayToCollection(list1);
		col1.forEach(System.out::println);
	}

	// Implement the body for Query 4
	public static List<Human> arrayToCollection(Human[] list) {

		List<Human> humans = Arrays.stream(list).collect(Collectors.toList());

		return humans;

	}

}
