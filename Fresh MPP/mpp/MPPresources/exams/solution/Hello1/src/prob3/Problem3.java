package prob3;

import helperclasses.Book;
import helperclasses.LibraryMember;
import helperclasses.LibrarySystemException;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();

	}

	Iterator<Book> books;

	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {
		LibraryMember member = mems.stream()
				.filter((mem) -> {
					try {
						return mem
							.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
							.getCheckoutRecordEntries().size() == 10;
					} catch (LibrarySystemException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return false;
				})
				.findFirst().orElse(null);
		return member;
	}
}
