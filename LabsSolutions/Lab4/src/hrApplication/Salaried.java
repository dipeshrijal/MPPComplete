package hrApplication;

public class Salaried extends Employee {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay() {
		return salary;
	}

}
