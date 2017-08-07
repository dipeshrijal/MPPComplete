package ploymorphism;

public class BusinessAccount extends Account {

	public BusinessAccount(double currentAmount, String accountNumber, double interestRate) {
		super(currentAmount, accountNumber);
		this.setInterestRate(interestRate);
	}

	private double interestRate;

	@Override
	public void addInterest() {
		double sum = getCurrentAmount() + getCurrentAmount() * interestRate;
		setCurrentAmount(sum);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
