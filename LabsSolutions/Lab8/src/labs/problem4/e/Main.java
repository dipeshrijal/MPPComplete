package labs.problem4.e;

import java.util.Arrays;
import java.util.List;

import labs.problem4.Product;

public class Main {

	public static void main(String[] args) {

		Product p1 = new Product("MacBook", 1799, 2017);
		Product p2 = new Product("iPhone", 1899, 2017);
		Product p3 = new Product("iMac", 5999, 2017);
		Product p4 = new Product("iPhone", 999, 2017);

		List<Product> products = Arrays.asList(p1, p2, p3, p4);

		products.sort((x, y) -> {
			if (x.getTitle().compareTo(y.getTitle()) == 0) {
				if (x.getPrice() == y.getPrice())
					return 0;
				else if (x.getPrice() < y.getPrice())
					return -1;
				else
					return 1;

			} else
				return x.getTitle().compareTo(y.getTitle());

		});

		products.forEach(System.out::println);

	}

}
