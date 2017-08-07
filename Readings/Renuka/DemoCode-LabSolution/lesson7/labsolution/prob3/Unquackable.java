package lesson7.labsolution.prob3;

public interface Unquackable extends Quackable {
	default void quack() {
		System.out.println("  cannot quack");
	}
}
