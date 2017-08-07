package prob2B;

import java.time.LocalDate;

public class OrderFactory {

	public static OrderAndOrderLine createOrder(int orderNum, LocalDate dateOfOrder, int lineNumber, double price,
			int quantity) {
		OrderLine ol = new OrderLine(orderNum, price, quantity);
		Order o = new Order(orderNum, dateOfOrder);
		ol.setOrder(o);
		o.setOrderLine(ol);

		return new OrderAndOrderLine(o, ol);
	}

}
