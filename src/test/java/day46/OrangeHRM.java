package day46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@Test(priority =1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt = \"company-branding\"]")).isDisplayed();
		Assert.assertTrue(true);
	}
	
	@Test(priority =2)
	void testAppURL() {
		Assert.assertEquals(driver.getCurrentUrl(),"https//opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority =3, dependsOnMethods = {"testAppURL"})
	void testTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void TearDown() {
		driver.quit();
		}
	
}
