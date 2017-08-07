package finalmpp.question2.problem2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import finalmpp.question2.helperclasses.CheckoutRecordEntry;
import finalmpp.question2.helperclasses.TestData;

public class Main {
	public static void main(String[] args) {
		List<CheckoutRecordEntry> aList = TestData.INSTANCE.getAllEntries();

		Comparator<CheckoutRecordEntry> byalphabet = (e1, e2) -> e1.getCopy().getBook().getTitle()
				.compareTo(e2.getCopy().getBook().getTitle());

		Comparator<CheckoutRecordEntry> bylength = (e1, e2) -> e1.getCopy().getBook().getTitle().length()
				- e2.getCopy().getBook().getTitle().length();

		System.out.println(aList.stream()
					.filter(e -> e.getCheckoutDate().equals(LocalDate.of(2015, 06, 27)))
					.sorted(bylength.reversed().thenComparing(byalphabet))
					.map(e -> e.getCopy().getBook().getTitle())
					.collect(Collectors.toList()));
	}
}
