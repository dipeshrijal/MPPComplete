package lesson7.labsolution.prob3;

public interface Unflyable extends Flyable {
	default void fly() {
		System.out.println("  cannot fly");
	}
}
