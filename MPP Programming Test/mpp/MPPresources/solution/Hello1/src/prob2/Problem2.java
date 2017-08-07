package prob2;

import helperclasses.Book;
import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Print to the console the list of book Title � in sorted order -- 
 * in which the book has been checked out on June 27, 2015. 
 * The ordering of the book title is as follows: First sort by the length 
 * of the title (number of characters), then by alphabetical order.  
 */
public class Problem2 {

	public static void main(String[] args) {
		// use this list
		Function<CheckoutRecordEntry, Integer> byTitleLength = (c) -> c.getCopy().getBook().getTitle().length();
		Function<CheckoutRecordEntry, String> byAlphabeticalOrder = (c) -> c.getCopy().getBook().getTitle();
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		List<CheckoutRecordEntry> checkOutRecords = list.stream()
				.filter((cor) -> cor.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.sorted(Comparator.comparing(byTitleLength).thenComparing(byAlphabeticalOrder))
				.collect(Collectors.toList());
		System.out.println(checkOutRecords);
	}

}
