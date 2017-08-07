package labs.problem2;

public class EquilateralTraingle implements Polygon {

	private double side;

	public EquilateralTraingle(double side) {
		this.side = side;
	}

	@Override
	public double computePerimeter() {
		return Polygon.super.computePerimeter(getSides());
	}

	@Override
	public double[] getSides() {
		double[] sides = { this.side, this.side, this.side };
		return sides;
	}
}