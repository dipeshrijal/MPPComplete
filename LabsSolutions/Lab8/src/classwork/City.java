package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class City {

	private String cname;
	private long population; // in millions

	public City(String cname, long population) {
		super();
		this.cname = cname;
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [cname=" + cname + ", population=" + population + "]";
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public static Comparator<City> NC = (o1, o2) -> o1.getCname().compareTo(o2.getCname());

	public static void main(String[] args) {

		List<City> list = new ArrayList<>();

		list.add(new City("LA", 20000));
		list.add(new City("IA", 1000));
		list.add(new City("NC", 35000));
		list.add(new City("NY", 45000));

		Collections.sort(list, City.NC);

		System.out.println(list);
	}
}
