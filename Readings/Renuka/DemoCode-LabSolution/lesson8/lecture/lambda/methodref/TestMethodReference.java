package lesson8.lecture.lambda.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

// Method References Examples

class Color {
	private String name;

	public Color(String name) {
		this.name = name;
	}

	public Color() {

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}
	

}

public class TestMethodReference {
	public static void main(String args[]) {
		// 1. static Method Reference
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("List of Numbers : ");
		list.forEach(System.out::println);
		// List<Integer> res = TestMethodReference.testPredicate(list,
		// x->TestMethodReference.isEven(x));
		List<Integer> res = TestMethodReference.testPredicate(list, TestMethodReference::isEven);
		System.out.println("Even Numbers :" + res);

		// 2. Instance method reference
		List<Color> color = Arrays.asList(new Color("Red"), new Color("Yellow"), new Color("Blue"), new Color("Pink"));
		// List<String> res1 = TestMethodReference.testPredicate1(color,
		// c->c.getName());
		List<String> res1 = TestMethodReference.testPredicate1(color, Color::getName);
		System.out.println("Colors List :" + res1);

		// 3. ClassName :: Instance Method

		List<String> str = Arrays.asList("Orange", "Banana", "Apple", "Grapes");
		// str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		str.sort(String::compareToIgnoreCase);
		System.out.println("Sorted List : " + str);

		String x = "Apple";
		// BiPredicate<List<String>,String> contain = (lt,y)->lt.contains(y);
		BiPredicate<List<String>, String> contain = List::contains;
		System.out.println("Is str list contains Apple : " + contain.test(str, x));
		
		// 4. Constructor References
		
		Function<String, Color> function = Color::new;
		@SuppressWarnings("unused")
		Function<String, Color> function1 = (s)->new Color(s);
		
	    Color ob = function.apply("Blue");
	    System.out.println(ob);
			
	}

	public static boolean isEven(Integer x) {
		return x % 2 == 0;
	}

	public static List<Integer> testPredicate(List<Integer> list, Predicate<Integer> predicate) {
		List<Integer> returnList = new ArrayList<>();
		for (Integer x : list) {
			if (predicate.test(x))
				returnList.add(x);
		}
		return returnList;
	}

	public static List<String> testPredicate1(List<Color> list, Function<Color, String> function) {
		List<String> returnList = new ArrayList<>();
		list.forEach(x -> returnList.add(function.apply(x)));
		return returnList;
	}

}
