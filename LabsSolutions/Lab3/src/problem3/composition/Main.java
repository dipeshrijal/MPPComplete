package problem3.composition;

import problem3.inheritance.Circle;
import problem3.inheritance.Cylinder;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(2);

		System.out.println(circle);

		Circle cylinder = new Cylinder(5,2);

		System.out.println(cylinder);

	}

}
