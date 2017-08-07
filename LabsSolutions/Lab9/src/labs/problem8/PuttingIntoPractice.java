package labs.problem8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).

		transactions.stream().sorted(Comparator.comparing(Transaction::getValue)).filter(t -> t.getYear() == 2011)
				.forEach(System.out::println);

		// Query 2: What are all the unique cities where the traders work?

		System.out.println("\nDistinct city \n");

		transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

		// Query 3: Find all traders from Cambridge and sort them by name.

		System.out.println("\ntraders from cambridge \n");

		transactions.stream().map(t -> t.getTrader()).filter(city -> city.getCity() == "Cambridge")
				.sorted(Comparator.comparing(Trader::getCity)).forEach(System.out::println);

		// Query 4: Return a string of all traders names sorted alphabetically.

		System.out.println("\nTrader sorted alphabetically \n");

		transactions.stream().map(t -> t.getTrader().getName()).sorted().collect(Collectors.toList())
				.forEach(System.out::println);

		// Query 5: Are there any trader based in Milan?

		System.out.println("\nTrader from Milan \n");

		System.out.println(transactions.stream().anyMatch(t -> t.getTrader().getCity() == "Milan"));

		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		System.out.println("\n Set Transactions to Mialn \n");
		transactions.stream()
		.filter(t -> t.getTrader().getCity() == "Milan")
		.forEach(t -> t.getTrader().setCity("Cambridge"));
		
		System.out.println(transactions);

		// Query 7: What's the highest value in all the transactions?
		
		System.out.println("\n Highest value \n");
		
		System.out.println(transactions.stream()
		.map(x -> x.getValue())
		.max(Comparator.comparing(x -> x))
		.get());
	}
}
