package problem3.composition;

public class Cylinder {
	private double height = 1.0;
	private Circle circle;

	public Cylinder() {

	}

	public Cylinder(double radius) {
		circle.setRadius(radius);
	}

	public Cylinder(double radius, double height) {
		circle.setRadius(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}
	
	public Circle getCircle() {
		return circle;
	}

	@Override
	public String toString() {
		return "The volume of cylinder is = " + getVolume();
	}
}
