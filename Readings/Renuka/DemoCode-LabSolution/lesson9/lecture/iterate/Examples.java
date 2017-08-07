package lesson9.lecture.iterate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {

	public static void main(String[] args) {
		// Stream<BigInteger> stream1 =
		// Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));

		Stream<Integer> stream2 = Stream.iterate(1, n -> n + 1);
		// Stream naturalNums = IntStream.iterate(1, n -> n+1);

		// System.out.println("naturalNums")

		// Stream<Integer> stream2 =
		// Stream.iterate(1, n -> n + 1)Limit;

		// naturalNums.collect(Collectors.toList()).forEach(System.out::println);
		stream2.limit(5).collect(Collectors.toList()).forEach(System.out::println);
	}

}
