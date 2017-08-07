package lesson9.lecture.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,7);
		Main m = new Main();
		m.printSum(list);
		m.printProduct(list);
		m.printDifference(list);
	}
	public void printSum(List<Integer> list) {
		Optional<Integer> sum1 = list.stream().reduce((a,b) -> a + b);
		System.out.println("sum1 = " + sum1.get());
		int sum2 = list.parallelStream().reduce(0, (a,b) -> a + b);
		System.out.println("sum2 = " + sum2);
	}
	
	public void printProduct(List<Integer> list) {
		int prod1 = list.stream().reduce(1, (a,b) -> a * b);
		System.out.println("prod1 = " + prod1);
		int prod2 = list.parallelStream().reduce(1, (a,b) -> a * b);
		System.out.println("prod2 = " + prod2);
	}
	
	public void printDifference(List<Integer> list) {
		int diff1 = list.stream().reduce(0, (a,b) -> a - b);
		System.out.println("diff1 = " + diff1);
		int diff2 = list.parallelStream().reduce(0, (a,b) -> a - b);
		System.out.println("diff2 = " + diff2);
		
	}

}
