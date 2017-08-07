package playground.enumexample.singleton;

public class Main {
	
	public static void main(String[] args) {
		MySingleton.INSTANCE.behaviour();
		
		MySingletonE single = MySingletonE.instanceOf();
		
		single.calc();
		
		
	}

}
