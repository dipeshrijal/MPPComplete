package playground.staticanddefaultinterface;

public class FunctionalInterface implements Test {

	@Override
	public void defaultMethod() {
		System.out.println("I am overridden");
	}

	public static void main(String[] args) {

		FunctionalInterface fi = new FunctionalInterface();

		fi.defaultMethod();
		
		fi.test();

		Test t = new FunctionalInterface();
		
		t.defaultMethod();

		t.hello();

		t.test(); // does not work if test method is not defined in interface

		Test.staticMethod();

	}

	@Override
	public void hello() {
		System.out.println("abastact hello");

	}

	public void test() {
		testCall();
	}

}

interface Test {

	static void staticMethod() {
		System.out.println("static hello");
	}

	default void defaultMethod() {
		System.out.println("default hello");
	}

	default void testCall() {
		System.out.println("test call");
	}
	
	void test();

	void hello();
}
