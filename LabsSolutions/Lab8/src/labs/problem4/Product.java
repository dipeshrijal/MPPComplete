package labs.problem4;

public class Product {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + model;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (model != other.model)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	final String title;
	final double price;
	final int model;

	public Product(String title, double price, int model) {
		super();
		this.title = title;
		this.price = price;
		this.model = model;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}

}
