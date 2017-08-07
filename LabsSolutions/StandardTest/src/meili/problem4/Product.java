package meili.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {

	static <V, K> List<Pair<K, V>> computeProduct(List<K> first, List<V> second){
//		int size = first.length * second.length;
//		int[][] pairs = new int[size][];
//		int count=0;
//		for (int i = 0; i < first.length; i++) {
//			for (int j = 0; j < second.length; j++) {
//				pairs[count++] = new int[]{first[i], second[j]};
//			}
//		}
//		return pairs;
		List<Pair<K, V>> pairs = new ArrayList<>();
		for (int i = 0; i < first.size(); i++) {
			for (int j = 0; j < second.size(); j++) {
				pairs.add(new Pair<K, V>(first.get(i), second.get(j)));
			}
		}
		
		return pairs;
	}
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,4,6);
		List<String> list2 = Arrays.asList("Dipesh", "Rijal");
//		int[] arr1 = {2,4,6};
//		int[] arr2 = {1,5};
//		int[][] product = computeProduct(arr1, arr2);
//		for (int i = 0; i < product.length; i++) {
//			System.out.println(Arrays.toString(product[i]));
//		}
		computeProduct(list1, list2).forEach(System.out::println);;
	}
}
