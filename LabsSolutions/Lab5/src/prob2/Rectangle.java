package prob2;

public class Rectangle implements Figure {

	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double computeArea() {
		return width * length;
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

}
