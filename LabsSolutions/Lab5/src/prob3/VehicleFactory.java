package prob3;

public class VehicleFactory {

	public Vehicle getVehicle(String v) {
		Vehicle vehicle = null;
		if (v == null) {
			vehicle = null;
			
		}
		
		else if (v.equals("car")) {
			vehicle = new Car();
		} else if (v.equals("truck")) {
			vehicle = new Truck();
		} else if (v.equals("electriccar")) {
			vehicle = new ElectricCar();
		} else if (v.equals("bus")) {
			vehicle = new Bus();
		}
		return vehicle;

	}
}
