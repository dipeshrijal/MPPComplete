package labs.problem3;

import java.util.ArrayList;
import java.util.List;

public class DoubleSum {

	public static void main(String[] args) {

		List<Integer> elements = new ArrayList<>();

		elements.add(5);
		elements.add(10);
		elements.add(15);

		List<Double> dou = new ArrayList<>();

		dou.add(5.0);
		dou.add(10.0);
		dou.add(15.0);

		System.out.println("The sum is " + sum(elements));
		System.out.println("The sum is " + sum(dou));

	}

	public static <T extends Number> double sum(List<T> elements) {
		double sum = 0;

		for (T t : elements) {
			sum += t.doubleValue();
		}

		return sum;
	}

}
