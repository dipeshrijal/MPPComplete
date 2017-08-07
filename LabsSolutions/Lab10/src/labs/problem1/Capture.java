package labs.problem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Capture {

	public static void main(String[] args) {

		List<String> original = Arrays.asList("Java", "MPP", "SE");

		reverse(original);

		System.out.println(original);

	}

	public static void reverse(List<?> list) {
		Collections.reverse(list);
	}

}
