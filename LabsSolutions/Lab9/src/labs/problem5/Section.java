package labs.problem5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public static void main(String[] args) {
		streamSection(nextStream(), 2, 4).forEach(System.out::println);
		System.out.println("second call");
		streamSection(nextStream(), 3, 3).forEach(System.out::println);
		System.out.println("third call");
		streamSection(nextStream(), 5, 8).forEach(System.out::println);
	}

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n - m + 1);
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

}
