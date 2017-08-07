package playground.enumexample;

public interface EnumTest {

	void execute();

	void test();

	default void hola() {
		System.out.println("hola");
	}

	default void namaste() {
		System.out.println("namaste");
	}

}
