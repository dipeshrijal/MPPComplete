package labs.problem2;

import java.util.function.Supplier;

public class MethodReference {
	
	public static void main(String[] args) {
		
		Supplier<Double> random = Math::random;
		
		System.out.println(random.get());
	}

}
