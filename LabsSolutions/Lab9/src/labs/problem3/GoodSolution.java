package labs.problem3;

import java.util.Arrays;
import java.util.List;

public class GoodSolution {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("hello", "haste", "hi", "dipesh", "john", "doe", "apple", "orange", "grapes",
				"banana");	

		GoodSolution good = new GoodSolution();
		int count = good.countWords(words, 'h', 'z', 5); // should return 2 "hello" and "haste"
		
		System.out.println("The count is = " + count);
	}

	public int countWords(List<String> words, char c, char d, int len) {
		final int total = (int) words.stream()
				.filter(word -> word.contains(Character.toString(c)))
				.filter(word -> ! word.contains(Character.toString(d)))
				.filter(word -> word.length() == len)
				.count();

		return total;
	}

}
