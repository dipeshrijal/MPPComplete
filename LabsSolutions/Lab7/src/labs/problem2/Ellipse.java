package labs.problem2;

public class Ellipse implements ClosedCurve {

	private double side1;
	private double side2;

	public Ellipse(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double computePerimeter() {
		return 4 * side1 * side2;
	}

}
