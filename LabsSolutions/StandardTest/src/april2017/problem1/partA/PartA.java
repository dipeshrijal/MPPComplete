package april2017.problem1.partA;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here

	BiPredicate<Double, Double> bi = (x, y) -> x * y < x + y;

	// representing lambda as a method refrence

	BiPredicate<Double, Double> mr = PartA::evaluate;

	// representing lambda as a static nested class

	static class biPredicate implements BiPredicate<Double, Double> {

		@Override
		public boolean test(Double x, Double y) {
			return x * y < x + y;
		}

	}

	// evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println(new biPredicate().test(2.1, 0.35));
		System.out.println(bi.test(2.1, 0.35));
		System.out.println(mr.test(2.1, 0.35));
	}

	public static boolean evaluate(Double x, Double y) {
		return x * y < x + y;
	}

	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}

}
