package problem2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings = new ArrayList<>();

	private String name;

	Landlord(String name) {
		this.name = name;
	}

	public void addBuilding(Building b) {
		buildings.add(b);
	}

	public List<Building> getBuilding() {
		return buildings;
	}

	public double calculateProfit() {
		double profit = 0;

		for (Building building : buildings) {
			profit += building.calculateProfit();
		}

		return profit;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public String getName() {
		return name;
	}

}
