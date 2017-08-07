package labs.problem3;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
	}

	@Override
	public void display() {
		System.out.println("Display decoy duck");
	}

	@Override
	public void quack() {
		muteQuack();
	}

	@Override
	public void fly() {
		cannotFly();
	}

}
