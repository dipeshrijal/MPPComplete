package hrApplication;

public class Paycheck {
	private double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;
	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public void print() {
		
		getNetPay();
		
		System.out.println(grossPay);
	}

	public void getNetPay() {

		grossPay = grossPay - (fica * grossPay + state * grossPay + local * grossPay + medicare * grossPay
				+ socialSecurity * grossPay);

	}

}
