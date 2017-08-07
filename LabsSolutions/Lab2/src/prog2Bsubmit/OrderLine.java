package prog2Bsubmit;

public class OrderLine {
	private int lineNo;
	private double price;
	private int quantity;
	private Order order;

	OrderLine(int lineNo, int price, int quantity) {
		this.lineNo = lineNo;
		this.price = price;
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

}
