package  prob2;

import org.junit.Assert;
import org.junit.Test;

public class TestCase {
@Test
public void test()
{
	Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
	Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
	Assert.assertEquals(true,Main.livesInFairfield(cust1));
	Assert.assertEquals(false, Main.livesInFairfield(cust2));
	
}
}
