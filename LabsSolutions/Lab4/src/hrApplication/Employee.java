package hrApplication;

public abstract class Employee {

	private int empId;
	private Paycheck paycheck;

	public int getEmpId() {
		return empId;
	}

	public Paycheck getPaycheck() {
		return paycheck;
	}

	public Employee(int empId) {
		this.empId = empId;
	}

	public void print() {
		calcCompensation(12, 12);

	}

	public Paycheck calcCompensation(int aMonth, int aYear) {
		return new Paycheck(calcGrossPay());
	}

	public abstract double calcGrossPay();

}
