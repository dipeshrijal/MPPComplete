package playground.interfaceconflicts;

public interface Interface1 {
	
	default void hola() {
		System.out.println("Interface 1 hola");
	}

}
