package com.mpp.lab1_2b;

public class Order {
	private int orderNum;
	private String dateOfOrder;
	List<OrderLine> ol;
	
	Order(int orderNum, String dateOfOrder){
		this.orderNum = orderNum;
		this.dateOfOrder = dateOfOrder;
		ol = new ArrayList<>(this);
	}

	public int getOrderNum() {
		return orderNum;
	}

	public String getDateOfOrder() {
		return dateOfOrder;
	}

	public List<OrderLine> getOl() {
		return ol;
	}
	

}
