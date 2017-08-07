package labs.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Dipesh");
		names.add("Amina");
		names.add("John");
		names.add("Jane");

		System.out.println(secondSmallest(names));
	}

	private static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

		List<T> sortedList = list.stream().sorted().collect(Collectors.toList());

		return sortedList.get(1);

	}

}
