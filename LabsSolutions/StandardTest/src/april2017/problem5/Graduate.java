package april2017.problem5;

public interface Graduate {
	// You can change
	default int scholarships() {

		return 2500;

	}

	default int feeCal() {
		return getFee() * getCourse() + 1000;
	}

	int getFee();

	int getCourse();
}
