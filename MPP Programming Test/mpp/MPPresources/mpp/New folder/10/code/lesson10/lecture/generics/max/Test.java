package lesson10.lecture.generics.max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String stringArray[] = new String[] { "mike", "Joseph", "tim"};
		List<String> stringList = Arrays.asList(stringArray);
//		String maxString = Max.max2(stringList);
		
		Collections.sort(stringList);
		Collections.sort(stringList, (x, y) -> x.length() - y.length());
		System.out.println(stringList);
//		
		List<Employee> employeeList = new ArrayList<Employee>(){{
			add(new Employee("anne", 10000));
			add(new Employee("michelle", 10000));
			add(new Employee("zoe", 10000));
		}};
		
		List<Manager> managerList = new ArrayList<Manager>(){{
			add(new Manager("anne", 10000, 2));
			add(new Manager("michelle", 10000, 5));
			add(new Manager("zoe", 10000, 3));
		}};
//		System.out.println(Max.max4(employeeList, new EmployeeNameComparator()).getName());
		
//		Max.max2(employeeList);
	//	Collections.sort(employeeList);
		
		List<EmployeeComparable> employeeComparableList = new ArrayList<EmployeeComparable>(){{
			add(new EmployeeComparable("anne", 10000));
			add(new EmployeeComparable("michelle", 10000));
			add(new EmployeeComparable("zoe", 10000));
		}};
//		Max.max2(employeeComparableList);
		
		
	}

}
