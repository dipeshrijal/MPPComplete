package Problem1.Exam.PartA;

import java.util.function.BiFunction;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here
	BiFunction<Double, Double, Boolean> biFunctionEx = (x,y) -> x * y < x + y;
	
	// representing lambda as a method refrence
	BiFunction<Double, Double, Boolean> biFunctionEx2 = (PartA::evaluateGreater);
	
	
	//representing lambda as a static nested class
	static class biFunctionEx3 implements BiFunction<Double, Double, Boolean>{
		@Override
		public Boolean apply(Double t, Double u) {
			return t * u < t + u;
		}
		
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		System.out.println("Lambda: " + biFunctionEx.apply(2.1, 0.35));
		System.out.println("Method Reference: " + biFunctionEx2.apply(2.1, 0.35));
		System.out.println("Nested Class: " + (new biFunctionEx3()).apply(2.1, 0.35));
		
		
	}
	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}
	
	private static boolean evaluateGreater(double x, double y) {
		return x * y < x + y;
	}
}
