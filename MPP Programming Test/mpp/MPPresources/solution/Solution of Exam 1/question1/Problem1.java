package finalmpp.question1;

import java.util.function.BiFunction;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	BiFunction<Double, Double, Boolean> bifunction = (x, y) -> x * y < x + y;

	// representing lambda as a method reference
	BiFunction<Double, Double, Boolean> bifunction2 = Problem1::findGreaterThan;

	// representing lambda as a static nested class
	public static class BiFun implements BiFunction<Double, Double, Boolean> {
		public Boolean apply(Double d1, Double d2) {
			return d1 * d2 < d1 + d2;
		}
	}

	public static boolean findGreaterThan(double d1, double d2) {
		return d1 * d2 < d1 + d2;
	}

	// evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println(bifunction.apply(2.1, 0.35));
		System.out.println(bifunction2.apply(2.1, 0.35));
		System.out.println(new BiFun().apply(2.1, 0.35));
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
}
