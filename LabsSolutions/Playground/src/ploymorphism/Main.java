package ploymorphism;

public class Main {

	public static void main(String[] args) {

		Bank everest = new Bank();

		Account chAccount = new CheckingsAccount(1200, "1123", 0.13);
		Account saAccount = new SavingsAccount(2300, "1222", 0.18);
		Account bAccount = new BusinessAccount(5000, "45444", 0.22);

		everest.addAccount(chAccount);
		everest.addAccount(saAccount);
		everest.addAccount(bAccount);

		for (Account account : everest.getAccountList()) {

			System.out.println(account.getCurrentAmount());

		}

		everest.addInterestToAllAccounts();

		for (Account account : everest.getAccountList()) {

			System.out.println(account.getCurrentAmount());

		}

	}

}
