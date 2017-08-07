package playground.enumexample;

public enum Size implements EnumTest {
	SMALL {
		@Override
		public void execute() {
			System.out.println("I am small size");
		}

		@Override
		public void test() {
			System.out.println("test small method");
		}
	},
	MEDIUM {
		@Override
		public void test() {
			System.out.println("test works");
		}
	},
	LARGE;

	@Override
	public void execute() {
		System.out.println("I am large size");
	}

	@Override
	public void test() {
		System.out.println("test for all");
	}
}
