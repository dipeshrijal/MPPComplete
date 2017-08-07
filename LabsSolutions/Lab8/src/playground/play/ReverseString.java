package playground.play;

import java.util.function.Function;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Dipesh";

		Function<String, String> rev = (x) -> {
			String reverse = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				reverse += x.charAt(i);
			}
			return reverse;
		};

		String reverse = rev.apply(s);

		System.out.println(reverse);
	}

}
