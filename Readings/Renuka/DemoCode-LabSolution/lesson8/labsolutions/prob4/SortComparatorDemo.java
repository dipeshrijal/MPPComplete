package lesson8.labsolutions.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	final String title;
	public int getModel() {
		return model;
	}

	final double price;
	final int model;

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	public String title() {
		return title;
	}

	public Double price() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
}

public class SortComparatorDemo {
	public static void main(String args[]) {
		// list of products, our target is to sort these product based upon
		// their price or title
		List<Product> product = new ArrayList<>();
		product.add(new Product("Samsung Calaxy", 200.75,2015));
		product.add(new Product("Apple IPod", 300.56,2014));
		product.add(new Product("Sony TV", 340.78,2012));
		product.add(new Product("LG Smart", 310.43,2015));
		
		
		// Creating Comparator to compare Price of products
		final Comparator<Product> PRICE_COMPARATOR = new Comparator<Product>() {
			@Override
			public int compare(Product t1, Product t2) {
				return t1.price().compareTo(t2.price());
			}
		};
		
		// Comparator to compare product title
		final Comparator<Product> TITLE_COMPARATOR = new Comparator<Product>() {
			@Override
			public int compare(Product c1, Product c2) {
				return c1.title().compareTo(c2.title());
			}
		};
		// sorting objects using Comparator by price
		System.out.println("\nList of products, before sorting");
		System.out.println(product);
		
		Collections.sort(product, PRICE_COMPARATOR);
		System.out.println("\nSorting list by price");
		System.out.println(product);
		
		System.out.println("\nSorting list by title ");
		Collections.sort(product, TITLE_COMPARATOR);
		System.out.println(product);
		
		// Now let's see how less code you need to write if you use
		// lambda expression from Java 8, in place of anonymous class
		// we don't need an extra line to declare comparator, we can provide
		// them in place to sort() method.
		System.out.println("\nSorting objects in decreasing order of price, using lambdas");
		Collections.sort(product, (c1, c2) -> c2.price().compareTo(c1.price()));
		System.out.println(product);
		
		System.out.println("\nSorting list in decreasing order of title, using lambdas");
		Collections.sort(product, (c1, c2) -> c2.title().compareTo(c1.title()));
		System.out.println(product);
		
		// Checking with more than one condition
		product.add(new Product("LG Smart", 320.43,2014));
		product.add(new Product("Sony TV", 320.43,2015));
		System.out.println("\nSorting using title and model");
		product.sort((lhs, rhs) -> {
        if (lhs.title.equals(rhs.title)) {
            return lhs.model - rhs.model;
        } else {
            return lhs.title().compareTo(rhs.title());
        }
    });
		   System.out.println(product);
   // Above logic tested using method reference
		   System.out.println("\nSorting using title and model using comparing and thenComparing");
   product.sort(Comparator.comparing(Product::title).thenComparing(Product::getModel));
   System.out.println(product);  
	}
}
