package day42;

import org.testng.annotations.Test;

/*open app
 * login app
 * logout
 */

public class MyFirstTestNGTestCase {
	
	@Test(priority=1)
	void openApp() {
		System.out.println("Opening app");
	}
	
	@Test(priority=2)
	void loginApp() {
		System.out.println("Login to app..........");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("logout from app.......");
	}
}
