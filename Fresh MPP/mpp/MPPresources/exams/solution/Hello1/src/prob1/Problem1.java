package prob1;

import java.util.function.BiFunction;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here

	BiFunction<Double, Double, Double> bf1 = (x, y) -> x * x + y * y;

	// representing lambda as a method refrence
	BiFunction<Double, Double, Double> bf2 = Problem1::sumSquares;
	// representing lambda as a static nested class

	private static Double sumSquares(double x, double y) {
		return x * x + y * y;
	}

	// evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		BiFunction<Double, Double, Double> bf = (x, y) -> x + y;
		System.out.println(bf.apply(2.1, 0.35));
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}

}
