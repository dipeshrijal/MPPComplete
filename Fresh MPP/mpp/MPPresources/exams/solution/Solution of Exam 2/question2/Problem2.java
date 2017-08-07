package finalmpp2.question2;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Problem2 {
	Supplier<Double> random = Math::random;
	BiFunction<Long, Long, Integer> longCompare = Problem2::compare;

	public void evaluator() {
		System.out.println(random.get());
		System.out.println(longCompare.apply(234l, 345l));
	}

	public static int compare(Long a, Long b) {
		return a.compareTo(b);
	}

	public static void main(String[] args) {
		Problem2 pr = new Problem2();
		pr.evaluator();
	}
}
