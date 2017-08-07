package prob1;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<LibraryMember> sampleData = TestData.getLibraryMembers();

		System.out.println("\n Part A");
		// Create a stream pipeline that prints to the console
		// the full names(first name and last name separated by a space)
		// of Library Members who live in the state of CA
		// and whose first name starts after the letter 'M',
		// sorted by age in ascending order.

		sampleData.stream().filter(lm -> lm.getAddress().getState().equals("CA"))
				.filter(lm -> lm.getFirstName().charAt(0) > 'M')
				.sorted((lm1, lm2) -> (Integer.valueOf(lm1.getAge())).compareTo(Integer.valueOf(lm2.getAge())))
				.map(lm -> lm.getFirstName() + " " + lm.getLastName()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("\n Part B");
		// Turn the stream pipeline from Part A into a LambdaLibrary item
		// and evaluate it here.

		System.out.println(LambdaLibrary.IMPLEMENT.apply(sampleData, "CA", 'M'));

		/*
		 * LambdaLibrary.char0 = 'M'; LambdaLibrary.sampleData = sampleData;
		 * LambdaLibrary.state = "CA";
		 * System.out.println(LambdaLibrary.IMPLEMENT);
		 */

		System.out.println("\n Part C");
		// Replace all lambda expressions in the stream pipeline from Part A
		// with instances of inner classes/functors.
		class LmAgeComparator implements Comparator<LibraryMember> {
			@Override
			public int compare(LibraryMember e1, LibraryMember e2) {
				if (e1.getAge() == e2.getAge())
					return 0;
				else if (e1.getAge() < e2.getAge())
					return -1;
				else
					return 1;
			}
		}
		class LmFirstCharAfterM implements Predicate<LibraryMember> {
			@Override
			public boolean test(LibraryMember lm1) {
				return lm1.getFirstName().charAt(0) > 'M';
			}
		}

		class LmFromCA implements Predicate<LibraryMember> {
			@Override
			public boolean test(LibraryMember lm1) {
				return lm1.getAddress().getState().equals("CA");
			}
		}
		sampleData.stream().filter(new LmFromCA()).filter(new LmFirstCharAfterM()).sorted(new LmAgeComparator())
				.map(lm -> lm.getFirstName() + " " + lm.getLastName()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("\n Part D");
		// Extra Credit: Create a stream pipeline that uses the reduce method
		// to get the Library member who has checked out the greatest number of
		// book copies.
		// You may assume there is exactly one such member.
		BinaryOperator<LibraryMember> accumulator = (lm1, lm2) -> {
			if (lm1.getCheckedOutCopies().size() < lm2.getCheckedOutCopies().size())
				return lm2;
			else
				return lm1;
		};
		LibraryMember highestNumber = sampleData.stream().reduce(accumulator).get();
		System.out.println(highestNumber.getFirstName() + " " + highestNumber.getLastName());

	}

}
