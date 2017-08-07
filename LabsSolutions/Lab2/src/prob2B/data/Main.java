package prob2B.data;

import java.util.List;

import prob2B.OrderAndOrderLine;
import prob2B.OrderFactory;
import prob2B.OrderLine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Collection<DataRecord> data = Database.h.values();

		List<OrderLine> orders = new ArrayList<>();

		for (DataRecord dataRecord : data) {

			OrderAndOrderLine orderline = OrderFactory.createOrder(dataRecord.getOrderNum(),
					dataRecord.getDateOfOrder(), dataRecord.getLineNumber(), dataRecord.getPrice(),
					dataRecord.getQuantity());

			orders.add(orderline.orderLine);

		}

		Iterator<OrderLine> it = orders.iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getOrder());
		}

	}

}
