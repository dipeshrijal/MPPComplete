package prob1;

import prob1.intface.FlyBehaviour;
import prob1.intface.QuackBehavior;

public abstract class Duck {

	private FlyBehaviour flyBehaviour;
	private QuackBehavior quackBehavior;

	public void quack() {
		quackBehavior.quack();
	}

	public void fly() {
		flyBehaviour.fly();
	}

	public void swim() {
		System.out.println("swimmimg");
	}

	public abstract void display();

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
