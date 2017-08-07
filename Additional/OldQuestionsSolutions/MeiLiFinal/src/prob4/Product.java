package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

	static <T, R> List<Pair<T, R>> computeProduct(List<T> first, List<R> second) {
		List<Pair<T, R>> pairs = new ArrayList<>();
		for (int i = 0; i < first.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				pairs.add(new Pair<T, R>(first.get(i), second.get(j)));
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 4, 6);
		List<String> l2 = Arrays.asList("A", "B");
		computeProduct(l1, l2).forEach(System.out::println);

	}
}
