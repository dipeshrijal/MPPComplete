package classwork.calculator;

public class CalculatorImpl {

	public static void main(String[] args) {
		
		Calculator addition = (x, y) -> x + y;
		Calculator sub = (x, y) -> x - y;
		Calculator multiply = (x, y) -> x * y;
		Calculator divide = (x, y) -> x / y;
		
		
		System.out.println(addition.calculate(4, 5));
		System.out.println(sub.calculate(4, 5));
		System.out.println(multiply.calculate(4, 5));
		System.out.println(divide.calculate(4, 5));
		

	}

}
