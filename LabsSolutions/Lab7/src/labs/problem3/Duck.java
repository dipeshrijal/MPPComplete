package labs.problem3;

public abstract class Duck implements QuackBehavior, FlyBehaviour {

	

	public void swim() {
		System.out.println("swimmimg");
	}

	public abstract void display();

}
