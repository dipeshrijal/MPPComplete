package lesson9.lecture.inclassexercise2;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExercise {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("joe", "andy", "mike");
		//String s = stream.reduce("", (x, y) -> x + " " + y);
		
//		Optional<String> op = stream.reduce((x, y) -> x + " " + y);
//		if(op.isPresent())
//			System.out.println(op.get());
		
		String s = stream.reduce("", (x, y) -> {
			StringBuilder sb = new StringBuilder();
			sb.append(x);
			sb.append(" ");
			sb.append(y);
			return sb.toString();
		});
		System.out.println(s);

	}
}
