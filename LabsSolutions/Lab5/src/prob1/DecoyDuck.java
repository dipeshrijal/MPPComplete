package prob1;

import prob1.behaviour.CannotFly;
import prob1.behaviour.MuteQuack;

public class DecoyDuck extends Duck {

	private CannotFly cannotFly;
	private MuteQuack muteQuack;

	public DecoyDuck() {
		cannotFly = new CannotFly();
		muteQuack = new MuteQuack();
		setFlyBehaviour(cannotFly);
		setQuackBehavior(muteQuack);
	}

	@Override
	public void display() {
		System.out.println("Display decoy duck");
	}

}
