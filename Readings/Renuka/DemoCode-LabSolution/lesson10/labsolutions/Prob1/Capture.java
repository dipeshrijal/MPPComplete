package lesson10.labsolutions.Prob1;

import java.util.*;

public class Capture {
	public static void reverse(List<?> items) {
		
		reverseHelper(items);
	}

	private static <T> void reverseHelper(List<T> list) {
		List<T> tmp = new ArrayList<T>(list);
		for (int i = 0; i < list.size(); i++) {
			list.set(i, tmp.get(list.size() - i - 1));
		}
		System.out.println(list);
	}

	public static void main(String args[]){
		
		List<Integer> IL = Arrays.asList(1,2,3,4,5);
		List<String> SL = Arrays.asList("Renuka","Vaisu","Mohan");
		reverse(IL);
		reverse(SL);
	}
}