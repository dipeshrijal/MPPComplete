package playground.interfaceconflicts;

public interface MainInterface extends Interface1, Interface2 {

	@Override
	default void hola() {
		System.out.println("default hola");
	}

}
