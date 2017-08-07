package problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartments = new ArrayList<>();
	private Landlord owner;
	public double maintainanceCost;

	public Building(double maintainanceCost) {
		this.maintainanceCost = maintainanceCost;
	}

	public void addApartment(Apartment a) {
		apartments.add(a);
	}

	public double calculateProfit() {
		double sum = 0;
		for (Apartment apartment : apartments) {
			sum += apartment.getRent();
		}

		return sum - maintainanceCost;
	}

	public List<Apartment> getApartment() {
		return apartments;
	}

	public Landlord getOwner() {
		return owner;
	}

	public void setOwner(Landlord owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return " " + maintainanceCost;
	}

}
