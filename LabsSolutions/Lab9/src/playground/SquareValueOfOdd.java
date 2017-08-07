package playground;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SquareValueOfOdd {

	public static void main(String[] args) {
		
		
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
		
		int summ = numbers1.stream().map(a -> a * a).reduce(0,Integer::sum);
		
		System.out.println(summ);	

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = numbers.stream().filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println(sum);

		// using streamOf

		Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6);

		int total = nums.filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println(total);

		// or can be used inline

		int total1 = Stream.of(1, 2, 3, 4, 5, 6).filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println(total1);

	}

}
