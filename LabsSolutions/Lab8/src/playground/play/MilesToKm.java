package playground.play;

import java.util.function.Function;

public class MilesToKm {

	public static void main(String[] args) {

		Function<Double, Double> milesToKm = (x) -> x * 1.6;

		double ans = milesToKm.apply(5.0);

		System.out.println(ans);

	}

}
