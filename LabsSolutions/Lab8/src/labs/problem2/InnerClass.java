package labs.problem2;

import java.util.function.Supplier;

public class InnerClass {

	public static void main(String[] args) {

		InnerClass inner = new InnerClass();
		InnerClass.Random random = inner.new Random();

		System.out.println(random.get());

	}

	class Random implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}

	}

}
