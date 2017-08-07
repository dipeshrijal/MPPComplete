package prob2.exam.partC;


import java.util.function.BiPredicate;

//The lambda:   (Long a, Long b) -> a.compareTo(b)
//NOTE: You may NOT type this as a BiFunction
public class PartC {

	// BiPredicate method
	BiPredicate<Long, Long> biPredicatLamda = (a, b) -> {
		//comparing a and b.
		if (a.compareTo(b)>0)
			return true;
		else
			return false;
	};

	// static method for method reference.
	public static boolean check(Long a, Long b) {
		if (a.compareTo(b)>0)
			return true;
		else
			return false;
	}

	// provide a method reference and the type of method reference
	BiPredicate<Long, Long> biPredicateWithMethodRe = PartC::check;

	// provide an inner class that behaves the same way as the labmda
	class MyClass implements BiPredicate<Long, Long> {
		@Override
		public boolean test(Long a, Long b) {
			return check(a, b);
		}

	}

	
	public void evaluator() {
		//evaluate with two sample values;
		long l1=(long) 66666;
		long l2=(long) 60000;
		System.out.println(biPredicateWithMethodRe.test(l1,l2));
		System.out.println(biPredicateWithMethodRe.test(l1,l2));
		System.out.println(new MyClass().test(l1, l2));
	}

	public static void main(String[] args) {
		PartC pa = new PartC();
		pa.evaluator();
	}
}
