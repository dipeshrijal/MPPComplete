package labs.problem3;

public class RedheadDuck extends Duck {

	public RedheadDuck() {

	}

	@Override
	public void display() {
		System.out.println("Display RedheadDuck");
	}

	@Override
	public void quack() {
		canQuack();
	}

	@Override
	public void fly() {
		flyWithWings();
	}

}
