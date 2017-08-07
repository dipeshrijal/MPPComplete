package april2017.problem5;

public class MIS implements Graduate {
	int fee;
	int courses;

	public MIS(int f, int c) {
		fee = f;
		courses = c;
	}
	// You can add your code here

	@Override
	public int feeCal() {
		return getFee() * getCourse() + 1700;
	}

	@Override
	public int getFee() {
		return fee;
	}

	@Override
	public int getCourse() {
		return courses;
	}
}
