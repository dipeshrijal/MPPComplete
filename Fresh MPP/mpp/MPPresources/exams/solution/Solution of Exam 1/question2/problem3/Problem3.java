package finalmpp.question2.problem3;

import java.util.Iterator;
import java.util.List;

import java.time.LocalDate;
import finalmpp.question2.helperclasses.Book;
import finalmpp.question2.helperclasses.LibraryMember;
import finalmpp.question2.helperclasses.TestData;

public class Problem3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem3 p = new Problem3();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		System.out.println(p.detectIfWinnerDuringCheckout(members));
		p.books = TestData.INSTANCE.getAllBooks().iterator();
		
		
	}
	Iterator<Book> books;
	
//	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
//		return null;
//		return mems.stream().filter(mem -> 
//		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
//		          .getCheckoutRecordEntries().size() == 10)
//		    .findFirst().orElse(null);
//	}

	public  LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {
		return mems.stream().filter(mem -> libraryHelper(mem)
				.getCheckoutRecordEntries().size() == 10)
				.findFirst().orElse(null);

	}

	private CheckoutRecord libraryHelper(LibraryMember mem) {
		CheckoutRecord ch = null;
		try {
			ch =  mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1));

		} catch (LibrarySystemException ex) {
			throw new RuntimeException();
		}
		return ch;
	}
}
