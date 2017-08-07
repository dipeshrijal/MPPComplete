package finalmpp.question5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<SeminarsConducted> seminars = new ArrayList<>();
		List<Project> projects = new ArrayList<>();

		Employee manager = new Manager("RAMESH", 1200000, LocalDate.of(2015, 02, 05), seminars);

		Employee leadEngineer = new LeadEngineer("MANOJ", 170000, LocalDate.of(2015, 05, 07), projects);

		List<Salary> s1 = new ArrayList<>();
		s1.add(manager);
		s1.add(leadEngineer);

		for (Salary s2 : s1) {
			System.out.println(s2.computeBonus());
		}
	}
}
