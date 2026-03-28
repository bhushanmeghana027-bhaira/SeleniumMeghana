package day43;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1. login
 * 2.search
 * 3.logout
 * 4. login 
 * 5. advsearch
 * 6.logout
 */
public class AnnotationsDemo1 {
	
	WebDriver driver;
	@BeforeMethod
	void login() {
		System.out.println("this is login");
	}
	
	
	@Test(priority =1)
	void search() {
		System.out.println("this is search");
	}
	
	
	@Test(priority=2)
	void advsearch() {
		System.out.println("this is adv search");
	}
	
	
	@AfterMethod
	void logout() {
	System.out.println("This is logout");
	}

}
