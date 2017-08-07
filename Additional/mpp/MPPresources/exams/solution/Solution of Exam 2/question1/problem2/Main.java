package PractiseQuestion2015.question2.problem2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import PractiseQuestion2015.question2.helperclasses.CheckoutRecordEntry;
import PractiseQuestion2015.question2.helperclasses.TestData;

public class Main {
	public static void main(String[] args) {
		List<CheckoutRecordEntry> aList = TestData.INSTANCE.getAllEntries();			
		System.out.println(aList.stream()
				.filter(e -> e.isOverdue())
				.filter(e -> !e.getCopy().isAvailable())
				.map(e -> e.getCopy())
				.collect(Collectors.toList()));
		
		
	}
}
