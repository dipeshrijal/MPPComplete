package prog2Bsubmit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderNum;
	private LocalDate dateOfOrder;
	private List<OrderLine> orderline;

	public Order(int orderNum, LocalDate dateOfOrder) {
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
		orderline = new ArrayList<>();
	}

	public OrderLine createOrderLine() {
		OrderLine orderline = new OrderLine(1, 2200, 5);

		return orderline;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public List<OrderLine> getOrderline() {
		return orderline;
	}

	public void setOrderline(List<OrderLine> orderline) {
		this.orderline = orderline;
	}

}
