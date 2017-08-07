package labs.problem3;

public class MallardDuck extends Duck {

	
	public MallardDuck() {
		
	}

	@Override
	public void display() {
		System.out.println("Display Mallard Duck");
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
