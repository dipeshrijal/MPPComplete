package problem2;

public class Main {

	public static void main(String[] args) {
		Landlord landlord = new Landlord("dipesh");

		Building b1 = new Building(50);

		Apartment a2 = new Apartment(100);
		Apartment a3 = new Apartment(100);
		Apartment a4 = new Apartment(100);

		b1.addApartment(a2);
		b1.addApartment(a3);
		b1.addApartment(a4);

		landlord.addBuilding(b1);

		Building b2 = new Building(50);
		b2.setOwner(landlord);

		Apartment a5 = new Apartment(100);
		a5.setBuilding(b2);
		Apartment a6 = new Apartment(100);
		Apartment a7 = new Apartment(100);

		b1.addApartment(a5);
		b1.addApartment(a6);
		b1.addApartment(a7);

		landlord.addBuilding(b2);
		
		Landlord owner = b2.getOwner();
		System.out.println(owner.getName());
		
		Building build = a5.getBuilding();
		System.out.println(build);

		System.out.println("Total profit :" + landlord.calculateProfit());

	}

}
