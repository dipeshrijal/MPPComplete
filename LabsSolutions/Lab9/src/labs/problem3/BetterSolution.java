package labs.problem3;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface QuadFunction<T, U, V, W, R> {
	R apply(T t, U u, V v, W w);
}

public class BetterSolution {

	private static final QuadFunction<List<String>, Character, Character, Integer, Integer> filtered = (list, c, d,
			len) -> (int) list.stream().filter(word -> word.contains(Character.toString(c)))
					.filter(word -> !word.contains(Character.toString(d))).filter(word -> word.length() == len).count();

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "haste", "hi", "dipesh", "john", "doe", "apple", "orange", "grapes",
				"banana");

		int count = BetterSolution.filtered.apply(words, 'h', 'z', 5); // should return 2

		System.out.println("The count is = " + count);
	}

}
