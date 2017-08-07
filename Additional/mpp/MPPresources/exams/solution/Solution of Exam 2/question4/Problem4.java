package finalmpp2.question4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import finalmpp2.question4.LibrarySystemException;

public class Problem4 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Anish", "Zook", "Book", "Pnglish");
		System.out.println(words.stream()
				.filter(e -> validate(e))
				.collect(Collectors.toList()));
	}

//	public static String validateLetters(String words) throws LibrarySystemException {
//		List<String> invalidCharacter = Arrays.asList("A", "B", "C", "E", "M", "N", "R", "S", "T");
//		for (String invalid : invalidCharacter) {
//			if (words.startsWith(invalid)) {
//				throw new LibrarySystemException("It starts with: " + invalid + "");
//			}
//		}
//	}

	public static boolean validate(String words) {
		boolean isFound = false;
		try {
			List<String> invalidCharacter = Arrays.asList("A", "B", "C", "E", "M", "N", "R", "S", "T");
			for (String invalid : invalidCharacter) {
				if (words.startsWith(invalid)) {
					isFound = true;
				}
			}
		} catch (IllegalArgumentException ex) {
			throw new RuntimeException();
		}
		return isFound;
	}
}
