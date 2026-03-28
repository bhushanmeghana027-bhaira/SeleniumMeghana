package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "dp" )
	void testlogin(String email,String pwd) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()=\"My Account\"]")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("(//a[text()=\"Logout\"])[2]")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		
	}
	
	@DataProvider(name = "dp")
	Object[][] loginData()
	{
		Object[][] data = {
							{"abc@gmail.com" , "test@123"},
							{"meghana04062002@gmail.com","Bhaira@2025"},
						  };
		return data;
	}

}
