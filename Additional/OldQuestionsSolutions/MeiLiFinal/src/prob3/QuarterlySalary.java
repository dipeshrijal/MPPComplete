package prob3;

import java.util.Arrays;

public class QuarterlySalary {

	public int[] getSalaries() {
		return salaries;
	}

	private int[] salaries;

	public QuarterlySalary(int[] salaries) {
		this.salaries = salaries;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob.getClass() != this.getClass())
			return false;
		QuarterlySalary q = (QuarterlySalary) ob;
		return Arrays.equals(getSalaries(), q.getSalaries());
	}

	public boolean equals(QuarterlySalary ob) {
		return Arrays.equals(getSalaries(), ob.getSalaries());
	}

	@Override
	public int hashCode() {
		int result = 17; // seed
		int i = 1;
		for (int s : salaries) {
			result += 31 * result + s * i;
			i++;
		}
		return result;

	}

}
