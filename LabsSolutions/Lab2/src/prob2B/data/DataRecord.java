package prob2B.data;

import java.time.LocalDate;

public class DataRecord {
	int orderNum;
	LocalDate dateOfOrder;
	int lineNumber;
	double price;
	int quantity;
	
	public DataRecord(int orderNum, LocalDate dateOfOrder, int lineNumber, double price, int quantity) {
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
		this.lineNumber = lineNumber;
		this.price = price;
		this.quantity = quantity;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
