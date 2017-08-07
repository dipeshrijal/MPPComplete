package meili.problem2;

import org.junit.Test;

import junit.framework.TestCase;

public class CityTest extends TestCase {

	@Test
	public void test() {
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust6 = new Customer("Anna", "1000 N 4th", "Fairfield", "52557");
		
		assertTrue(Main.city(cust6));
		assertFalse(Main.city(cust4));
	}

}
