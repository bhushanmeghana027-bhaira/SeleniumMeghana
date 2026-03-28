package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotationsDemo {
//	@Test
//	void pqr() {
//		System.out.println("this is pqr from c3");
//	}
	@BeforeMethod
		void bm() {
			System.out.println("This is before method form c3");
		}
	@AfterMethod
	void am() {
		System.out.println("This is after method form c3");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("This is before class form c3");
	}
@AfterClass
void ac() {
	System.out.println("This is after class form c3");
}
	
	@BeforeSuite
	void bs() {
		System.out.println("This is before suite form c3");
	}
	@AfterSuite
	void as() {
		System.out.println("This is after suite form c3");
	}
	@Test
	void xyz() {
		System.out.println("This is xyz from c22..,.,.,.");
	}
	
	@AfterTest
	void at() {
		System.out.println("this is aftertest method.,,.,.,.");
	}
	@Test
	void abc() {
		System.out.println("This is abc from c1..,.,.,.");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is beforetest method.,,.,.,.");
	}
}
