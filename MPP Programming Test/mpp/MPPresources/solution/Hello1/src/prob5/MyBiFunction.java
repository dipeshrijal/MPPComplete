package prob5;

import java.util.function.BiFunction;

public class MyBiFunction {
	public static BiFunction<Integer, Integer, Integer> bf = (a, b) -> 400 * (a - b);
}
