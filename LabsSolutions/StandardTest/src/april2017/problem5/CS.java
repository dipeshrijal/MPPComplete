package april2017.problem5;

public class CS implements Graduate {
	int fee;
	int courses;

	public CS(int f, int c) {
		fee = f;
		courses = c;
	}
	// You can add your code here

	

	@Override
	public int feeCal() {
		return getFee() * getCourse() + 1500;
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
