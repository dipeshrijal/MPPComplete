package com.mpp.lab1_2b;

public class OrderLine {
	private int lineNo;
	private int price;
	private int quantity;
	Order order;
	
	OrderLine(int lineNo, int price, int quantity, Order ord){
		this.lineNo = lineNo;
		this.price  = price;
		this.quantity = quantity;
		order = ord;
	}

	public int getLineNo() {
		return lineNo;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Order getOrder() {
		return order;
	}
}
