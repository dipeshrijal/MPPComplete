package hrApplication;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private final double commission = 0.10;
	private double baseSalary;
	private List<Order> orders;

	public double getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Commissioned(int empId, double baseSalary) {
		super(empId);
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public double calcGrossPay() {
		return baseSalary + (calculateOrderAmount() * commission);
	}

	public double calculateOrderAmount() {
		double sum = 0;
		for (Order order : orders) {
			sum += order.getOrderAmount();
		}

		return sum;
	}

}
