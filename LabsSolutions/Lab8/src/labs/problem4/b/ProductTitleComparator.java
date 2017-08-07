package labs.problem4.b;

import java.util.Comparator;

import labs.problem4.Product;

public class ProductTitleComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

	

}
