package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Figure triangle = new Triangle(22, 3);
		Figure triangle1 = new Triangle(11, 4);

		Figure circle = new Circle(4);
		Figure circle1 = new Circle(5);

		Figure rectangle = new Rectangle(46, 34);
		Figure rectangle1 = new Rectangle(55, 88);

		List<Figure> figures = new ArrayList<>();
		figures.addAll(Arrays.asList(triangle, triangle1, circle, circle1, rectangle, rectangle1));

		double area = 0;

		for (Figure figure : figures) {
			area += figure.computeArea();
		}
		
		System.out.println(String.format("Sum of Areas = %.2f:", area));

	}

}
