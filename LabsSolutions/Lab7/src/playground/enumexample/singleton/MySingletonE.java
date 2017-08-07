package playground.enumexample.singleton;

public class MySingletonE {
	
	private static MySingletonE instance;
	private int i = 1;
	
	private MySingletonE() {}
	
	
	public static MySingletonE instanceOf() {
		instance = new MySingletonE();
		
		return instance;
	}
	
	
	public void calc() {
		System.out.println(i++);
	}

}
