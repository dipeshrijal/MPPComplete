package prob1.prob1;

import prob1.helperclasses.Book;
import prob1.helperclasses.CheckoutRecord;
import prob1.helperclasses.LibraryMember;
import prob1.helperclasses.LibrarySystemException;
import prob1.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import javax.management.RuntimeErrorException;

public class Problem1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

	}

	Iterator<Book> books;

	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {

		// fix this
		return mems.stream()
			   .filter(mem -> helperMethod(mem)//calling helperMetho
			   .getCheckoutRecordEntries()
			   .size() == 10).findFirst().orElse(null);

	}

	// generating helper method to handle exception
	public CheckoutRecord helperMethod(LibraryMember mem) {
		CheckoutRecord cr = null;
		try {
			cr = mem.checkout(books.next().getNextAvailableCopy(),
					LocalDate.now(), LocalDate.of(2015, 9, 1));

		} catch (LibrarySystemException ex) {
			throw new RuntimeException(ex);
			// System.out.println(ex.getMessage());
		}
		return cr;

	}
}
