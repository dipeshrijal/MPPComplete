package lesson7.labsolution.prob3;

public interface Squeakable extends Quackable {
	default void quack() {
		System.out.println("   squeaking");
	}
}
