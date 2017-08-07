package MPPExam.prob2.exam.partC;

import java.util.Comparator;

//The lambda:   (Long a, Long b) -> a.compareTo(b)
//NOTE: You may NOT type this as a BiFunction
public class PartC {
	
	//provide a functional interface type for the lambda - do NOT use BiFunction
	Comparator<Long> comp = (a,b) ->a.compareTo(b);
	
	//provide a method reference and the type of method reference
	//TYPE: Class::instanceMethod
	Comparator<Long> compMethodRef = Long::compareTo;
	// provide an inner class that behaves the same way as the labmda
	//class My--- implements --- { }

	class ComparatorImpl implements Comparator<Long>{
		@Override
		public int compare(Long o1, Long o2) {
			return o1.compareTo(o2);
		}
	}

	public void evaluator() {
		System.out.println("Comparator with lambda expression");
		System.out.println(comp.compare(2L,3L));
		System.out.println("Comparator with method reference");
		System.out.println(compMethodRef.compare(2L,3L));
		System.out.println("Comparator with inner class");
		System.out.println(new ComparatorImpl().compare(2L,3L));
	}
	
	public static void main(String[] args) {
		PartC pa = new PartC();
		pa.evaluator();
	}
}
