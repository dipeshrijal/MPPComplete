package lesson8.lecture.closures.employeeInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	private final String sortMethod = "BYNAME";
	public void sort(List<Employee> emps, final String method) {
		class EmployeeNameComparator implements Comparator<Employee> {
			@Override
			// Comparator is now aware of sortMethod
			public int compare(Employee e1, Employee e2) {
				if (sortMethod.equals(method)) {
					return e1.name.compareTo(e2.name);
				} else {
					throw new IllegalArgumentException("don't know how to sort");
				}
			}
		}
		Collections.sort(emps, new EmployeeNameComparator());			
	}
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, "BYNAME");
		System.out.println(emps);
		//ei.sort(emps, "BYSALARY");
	}
}
