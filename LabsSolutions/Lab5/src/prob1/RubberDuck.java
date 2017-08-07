package prob1;

import prob1.behaviour.CannotFly;
import prob1.behaviour.Squeak;

public class RubberDuck extends Duck {

	private Squeak squeak;
	private CannotFly cannotFly;

	public RubberDuck() {
		squeak = new Squeak();
		cannotFly = new CannotFly();
		setFlyBehaviour(cannotFly);
		setQuackBehavior(squeak);
	}

	@Override
	public void display() {
		System.out.println("Display Rubber Duck");
	}

}
