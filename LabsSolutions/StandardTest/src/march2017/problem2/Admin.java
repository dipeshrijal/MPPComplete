package march2017.problem2;

import java.util.List;

public class Admin {

	public static double computeUpdatedBalanceSum(List<Employee> list) {
		// double sum = 0;
		// for (Employee employee : list) {
		//
		// sum += employee.computeUpdatedBalanceSum();
		//
		// }
		// return sum;

		return list.stream().map(Employee::computeUpdatedBalanceSum).reduce(0.0, (x, y) -> x + y);
	}

}
