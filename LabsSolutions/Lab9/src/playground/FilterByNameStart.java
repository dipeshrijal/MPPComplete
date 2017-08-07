package playground;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByNameStart {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();

		words.add("dipesh");
		words.add("rijal");
		words.add("john");
		words.add("jane");
		words.add("doe");

		List<String> startsWith = words.stream().filter(name -> name.startsWith("j")).collect(Collectors.toList());

		System.out.println(startsWith);
	}

}
