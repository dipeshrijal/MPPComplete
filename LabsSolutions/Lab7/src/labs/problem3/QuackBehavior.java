package labs.problem3;

public interface QuackBehavior {
	public void quack();

	public default void muteQuack() {
		System.out.println("cannot quack");
	}

	public default void canQuack() {
		System.out.println("quacking");
	}

	public default void squeak() {
		System.out.println("squeaking");
	}

}
