package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test(priority=1)
	void open() {
		Assert.assertTrue(true);
	}
	@Test(priority=2 , dependsOnMethods= {"open"})
	void login() {
		Assert.assertTrue(false);
	}
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"login","search"})
	void advSearch() {
		Assert.assertTrue(true);
	}
	@Test(priority=5, dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}

}
