package labs.problem2;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {	
		System.out.println(getStream().max());
		System.out.println(getStream().min());
	}
	
	
	public static IntStream getStream() {
		return IntStream.of(1, 2, 5, 34, 23, 55, 67, 98, 3, 45);
	}

}
