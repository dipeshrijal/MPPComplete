package prob1;

import prob1.behaviour.FlyWithWings;
import prob1.behaviour.Quack;

public class MallardDuck extends Duck {

	private FlyWithWings flyWithWings;
	private Quack quack;

	public MallardDuck() {
		flyWithWings = new FlyWithWings();
		quack = new Quack();
		setFlyBehaviour(flyWithWings);
		setQuackBehavior(quack);
	}

	@Override
	public void display() {
		System.out.println("Display Mallard Duck");
	}

}
