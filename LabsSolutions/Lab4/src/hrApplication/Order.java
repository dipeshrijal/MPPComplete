package hrApplication;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	public int getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	private double orderAmount;
	
	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		this.orderAmount = orderAmount;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
}
