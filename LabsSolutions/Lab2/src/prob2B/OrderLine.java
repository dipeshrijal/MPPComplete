package prob2B;

public class OrderLine {
	private int lineNo;
	private double price;
	private int quantity;
	private Order order;
	
	OrderLine(int lineNo, double price, int quantity) {
		this.lineNo = lineNo;
		this.price = price;
		this.quantity = quantity;
	}

	public int getLineNo() {
		return lineNo;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "|Line Number= " + lineNo + "|Quantity = " + quantity + " |Price = " + price + " ";
	}

}
