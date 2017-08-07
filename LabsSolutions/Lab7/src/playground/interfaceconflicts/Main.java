package playground.interfaceconflicts;

public class Main implements Interface1, Interface2 {

	public static void main(String[] args) {
		Main main = new Main();

		main.hola();
	}

	@Override
	public void hola() {
		Interface1.super.hola();		
	}
}
