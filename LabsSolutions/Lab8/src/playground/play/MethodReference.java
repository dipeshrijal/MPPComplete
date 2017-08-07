package playground.play;

import java.util.function.BiFunction;

public class MethodReference {

	public static void main(String[] args) {

		BiFunction<Double, Double, Double> add = MethodReference::add;
		System.out.println(add.apply(5.0, 6.0));

		BiFunction<Double, Double, Double> bi = Math::pow;
		System.out.println(bi.apply(2.0, 4.0));
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

}
