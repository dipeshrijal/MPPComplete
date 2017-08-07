package labs.problem3;

public class RubberDuck extends Duck {

	public RubberDuck() {
	}

	@Override
	public void display() {
		System.out.println("Display Rubber Duck");
	}

	@Override
	public void quack() {
		squeak();		
	}

	@Override
	public void fly() {
		cannotFly();
	}

}
