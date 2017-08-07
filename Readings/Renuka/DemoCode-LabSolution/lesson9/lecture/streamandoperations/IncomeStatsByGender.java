// IncomeStatsByGender.java
package lesson9.lecture.streamandoperations;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

import java.util.DoubleSummaryStatistics;
import java.util.Map;

public class IncomeStatsByGender {
	public static void main(String[] args) {
		// Summarizing Genders count, min, average, total and max
		Map<Person.Gender, DoubleSummaryStatistics> incomeStatsByGender = 
			Person.persons()
			      .stream()	
			      .collect(groupingBy(Person::getGender, 
			                          summarizingDouble(Person::getIncome)));

		System.out.println(incomeStatsByGender);
	}
}
