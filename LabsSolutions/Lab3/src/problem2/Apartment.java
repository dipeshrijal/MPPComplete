package problem2;

public class Apartment {
	private double rent;
	private Building building;

	public Apartment(double rent) {
		this.rent = rent;
	}

	public double getRent() {
		return rent;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

}
