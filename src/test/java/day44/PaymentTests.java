package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority =1, groups = {"sanity","regression","functional"})
	void PaymentInRupees() {
		System.out.println("PAyment in rupees");
	}
	@Test(priority=2, groups = {"sanity","regression","functional"})
	void PaymentInDollars() {
		System.out.println("PAyment in dollars");
	}
}
