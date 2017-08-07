package prob3;

public class App {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		factory.getVehicle("car").startEngine();
		
		factory.getVehicle("truck").startEngine();
		
		factory.getVehicle(null).startEngine();
	}

}
