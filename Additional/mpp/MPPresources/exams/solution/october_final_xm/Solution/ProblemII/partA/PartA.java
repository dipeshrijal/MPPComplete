package prob2.exam.partA;

import java.util.function.Supplier;




//The lambda:   () -> Math.random()
public class PartA {
	
	//provide a functional interface type for the lambda
	Supplier<Double> supByLamda = ()->Math.random();
	
	//provide a method reference and the type of method reference
	Supplier<Double> supByMethodReference = Math::random;
	
	
	// provide an inner class that behaves the same way as the lamda
		class MYnewClas implements Supplier<Double>{
			@Override
			public Double get(){
				return Math.random();
			}
			
		}
	
	
	public void evaluator() {
		//implement the lambda, the method reference, and the inner class operation
		
		System.out.println(supByLamda.get());
		System.out.println(supByMethodReference.get());
		System.out.println(new MYnewClas().get());
	}
	
	public static void main(String[] args) {
		PartA pa = new PartA();
		pa.evaluator();
	}
}
