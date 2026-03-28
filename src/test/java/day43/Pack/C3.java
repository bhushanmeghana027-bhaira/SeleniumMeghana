package day43.Pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("this is pqr from c3");
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("This is before suite form c3");
	}
	@AfterSuite
	void as() {
		System.out.println("This is after suite form c3");
	}

}
