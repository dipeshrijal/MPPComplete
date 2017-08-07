package lesson9.lecture.lambdas.notthreadsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	private final String sortMethod = "BYNAME";
	private boolean flag = true;
	public void sort(List<Employee> emps, String method) {
		Comparator<Employee> comparator = (Employee e1, Employee e2) -> {
				if (sortMethod.equals(method)) {
					flag = false;
					return e1.name.compareTo(e2.name);
				} else {
					flag = true;
					throw new IllegalArgumentException("don't know how to sort");
				}
		};
		Collections.sort(emps, comparator);			
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
