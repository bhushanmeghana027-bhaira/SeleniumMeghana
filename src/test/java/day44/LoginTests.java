package day44;

import org.testng.annotations.Test;
/*
 * note group name can be anything
 * grouping is only possible via .xml file so u need to convert , or create own
 */
public class LoginTests {
	@Test(priority =1 , groups="sanity")
	void loginByEmail() {
		
	}
	
	@Test(priority =2, groups="sanity")
	void loginByFacebook() {
		
	}
	
	@Test(priority =3, groups="sanity")
	void loginByTwitter() {
		
	}
}
