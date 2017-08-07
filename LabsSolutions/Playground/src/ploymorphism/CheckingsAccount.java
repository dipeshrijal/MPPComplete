package ploymorphism;

public class CheckingsAccount extends Account {

	private double interestRate;

	public CheckingsAccount(double currentAmount, String accountNumber, double interestRate) {
		super(currentAmount, accountNumber);
		this.interestRate = interestRate;
	}

	@Override
	public void addInterest() {
		double sum = 0;

		sum = getCurrentAmount() + getCurrentAmount() * interestRate;

		setCurrentAmount(sum);

	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
