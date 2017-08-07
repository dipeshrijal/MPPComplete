package MPPExam.prob2.exam.partA;


import java.util.function.Supplier;

//The lambda:   () -> Math.random()
public class PartA {
	//provide a functional interface type for the lambda
	Supplier<Double> rand = () -> Math.random();
	
	//provide a method reference and the type of method reference
	//TYPE: Class::staticMethod
	Supplier<Double>randMethodref = Math::random;
	
	
	// provide an inner class that behaves the same way as the labmda
	//class MyClass implements ... { }
	 class Randgenerator implements Supplier<Double>{
		@Override
		public Double get() {
			return Math.random();
		}
	}
	
	
	public void evaluator() {
		//implement the lambda, the method reference, and the inner class operation
		System.out.println("Using functional interface " +rand.get()); //calling with functional interface
		System.out.println("Using method reference " +randMethodref.get()); //calling with method reference
		System.out.println("Using inner class " + new Randgenerator().get()); //calling with inner class

	}
	
	public static void main(String[] args) {
		PartA pa = new PartA();
		pa.evaluator();
	}
}
