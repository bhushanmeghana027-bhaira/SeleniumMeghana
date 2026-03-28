package day42;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * open app
 * test logo presence
 * login
 * close
 */
import org.testng.annotations.Test;

public class OrangeHRMTestNG {
	WebDriver driver;
  @Test(priority=1)
  public void openApp() {
	  
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority=2)
  void testLogo() throws InterruptedException {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Thread.sleep(10000);
	  boolean isImageVisible = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	  System.out.println(isImageVisible);
	  
  }
  
  @Test(priority=3)
  void testLogin() {
	  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
  }
  
  @Test(priority=3)
  void testLogout() {
	  driver.close();
  }
  
}
