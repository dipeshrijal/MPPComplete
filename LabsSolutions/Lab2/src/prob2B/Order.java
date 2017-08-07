package prob2B;

import java.time.LocalDate;

public class Order {
	private int orderNum;
	private LocalDate dateOfOrder;
	private OrderLine orderLine;

	public Order(int orderNum, LocalDate dateOfOrder) {
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	@Override
	public String toString() {
		return "|Order Num " + orderNum + " |Date " + dateOfOrder + " " + orderLine;
	}

}
