package meili.problem3;

import java.util.Arrays;


public class QuarterlySalary {
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + Arrays.hashCode(salaries);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuarterlySalary other = (QuarterlySalary) obj;
		if (!Arrays.equals(salaries, other.salaries))
			return false;
		return true;
	}

	public int[] getSalaries() {
		return salaries;
	}
	private int[] salaries;
	public QuarterlySalary(int[] salaries) {
		this.salaries = salaries;
	}

	public boolean equals(QuarterlySalary ob) {
		 return Arrays.equals(getSalaries(), ob.getSalaries());
	}
	
}
