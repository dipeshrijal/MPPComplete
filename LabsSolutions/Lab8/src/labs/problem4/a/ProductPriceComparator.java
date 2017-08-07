package labs.problem4.a;

import java.util.Comparator;

import labs.problem4.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.getPrice() == o2.getPrice()) {
			return 0;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1;
		} else {
			return 1;
		}
	}

}
