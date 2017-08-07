package prob5;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;

public class LeadEngineer extends Employee {
	private List<Project> projects;

	public LeadEngineer(String name, double salary, LocalDate hireDate, List<Project> projects) {
		super(name, salary, hireDate);
		this.projects = projects;
	}

	public double getSalary() {
		return getSalary() + computeBonus();
	}

	double computeBonus() {
		return MyBiFunction.bf.apply(getHireDate().getYear(), LocalDate.now().getYear());
	}
}
