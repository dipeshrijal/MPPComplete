package hrApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Hourly hourly = new Hourly(1, 35, 40);
		Salaried salried = new Salaried(2, 5000);
		Commissioned commissioned = new Commissioned(3, 2000);
		
		Order order = new Order(1, LocalDate.now(), 500);
		Order order1 = new Order(2, LocalDate.now(), 300);
		commissioned.addOrder(order);
		commissioned.addOrder(order1);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(hourly);
		employees.add(salried);
		employees.add(commissioned);
		
		for (Employee employee : employees) {
			employee.calcCompensation(12, 12).print();
		}
	}

}
