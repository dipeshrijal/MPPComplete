package march2017.problem2;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;

	private List<Account> accounts;

	public Employee(String name) {
		accounts = new ArrayList<>();
		this.name = name;
	}

	public double computeUpdatedBalanceSum() {
		// double sum = 0;
		// for (Account account : accounts) {
		// sum += account.computeUpdatedBalance();
		// }
		//
		// return sum;

		return accounts.stream().map(Account::computeUpdatedBalance).reduce(0.0, (x, y) -> x + y);
	}

	public void addAccount(Account acct) {
		accounts.add(acct);
	}

	public String getName() {
		return name;
	}

}
