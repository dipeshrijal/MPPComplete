package prob1.prob1;

import prob1.helperclasses.Book;
import prob1.helperclasses.LibraryMember;
import prob1.helperclasses.TestData;

import java.util.Iterator;
import java.util.List;
public class Problem1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		List<LibraryMember> members = TestData.INSTANCE.getMembers();
		p.books = TestData.INSTANCE.getAllBooks().iterator();
		
		
	}
	Iterator<Book> books;
	
	public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems)  {
		return null;
		//fix this
//		return mems.stream().filter(mem -> 
//		       mem.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
//		          .getCheckoutRecordEntries().size() == 10)
//		    .findFirst().orElse(null);
		
		
	}
}
