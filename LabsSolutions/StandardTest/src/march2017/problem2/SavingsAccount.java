package march2017.problem2;

public class SavingsAccount extends Account {

	private double balance;

	private double interestRate;

	private String acctId;

	public SavingsAccount(String acctId, double interestRate, double startBalance) {
		this.balance = startBalance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}

	@Override
	public String getAccountID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (balance * interestRate);
	}

}
