package MPPExam.prob1.prob1;


import MPPExam.prob1.helperclasses.*;

import java.time.LocalDate;
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

    /**
     * A method for returning the winner member from the list of library members
     *
     * @param mems
     * @return
     */
    public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {
        return mems.stream().filter(mem -> checkoutHelper(mem)
                .getCheckoutRecordEntries().size() == 10)
                .findFirst().orElse(null);

    }

    /**
     * A helper method used to suitably handle the error associated with getting a record
     * before getting into the filter, where errors are thrown
     *
     * @param member
     * @return
     */
    public CheckoutRecord checkoutHelper(LibraryMember member) {
        CheckoutRecord record = null;
        try {
            record = member.checkout(books.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1));
        } catch (LibrarySystemException e) {
            throw new RuntimeException(e);
        }
        return record;
    }
}
