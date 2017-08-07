package classwork;

import java.util.function.Function;

@FunctionalInterface
interface Circle {

	double area(double r);

}

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("==============Traditional Lambda Interface=========================");
		
		
		Circle circle = (r) -> Math.PI * Math.pow(r, 2);
		
		
		System.out.println(circle.area(5.5));
		System.out.println(circle.area(7.5));
		
		
		System.out.println("==============Function Interface===================================");
		
		
		Function<Double, Double> circlefunction = (r) -> Math.PI * Math.pow(r, 2);
		

		double x = circlefunction.apply(5.5);
		double y = circlefunction.apply(7.5);
		
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		

	}

}
