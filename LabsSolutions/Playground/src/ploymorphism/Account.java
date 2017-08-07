package ploymorphism;

public abstract class Account {

	private double currentAmount;
	private String accountNumber;

	public Account(double currentAmount, String accountNumber) {
		this.currentAmount = currentAmount;
		this.accountNumber = accountNumber;
	}

	public void deposit() {

	}

	public void withdraw() {

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public abstract void addInterest();

}
