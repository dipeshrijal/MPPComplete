package playground.interfaceconflicts;

public class Sub extends Main implements Interface1, Interface2 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		
		sub.hola();
	}

}
