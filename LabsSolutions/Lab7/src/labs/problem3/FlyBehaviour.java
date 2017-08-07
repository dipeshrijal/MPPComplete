package labs.problem3;

public interface FlyBehaviour {

	public void fly();
	
	public default void cannotFly() {
		System.out.println("cannot fly");
	}
	
	public default void flyWithWings() {
		System.out.println("Fly with wings");
	}

}
