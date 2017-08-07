package ploymorphism;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Account> accountList;
	
	public Bank() {
		accountList = new ArrayList<Account>();
	}

	public void addAccount(Account account) {
		accountList.add(account);
	}

	public void deleteAccount(Account account) {
		accountList.remove(account);
	}

	public void addInterestToAllAccounts() {

		for (Account account : accountList) {
			account.addInterest();
		}

	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

}
