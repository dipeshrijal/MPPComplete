package april2017.problem2;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import april2017.helperclasses.Book;
import april2017.helperclasses.CheckoutRecord;
import april2017.helperclasses.LibraryMember;
import april2017.helperclasses.TestData;
public class Problem2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem2 p = new Problem2();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();
		
		/*
		 * Test
		 */
		LibraryMember lm = p.detectIfWinnerDuringCheckout(members);
		System.out.println(lm);
	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		//return null;
		//fix this
		return mems
				.stream()
				.filter(getRecords)
			    .findFirst().orElse(null);
	}
	
	/*
	 * Predicate 
	 */
	Predicate<LibraryMember> getRecords = mem -> checkoutHelper(mem).getCheckoutRecordEntries().size() == 10;
	
	/*
	 * Helper Method
	 */
	public CheckoutRecord checkoutHelper(LibraryMember mem){
		try {
			return mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}