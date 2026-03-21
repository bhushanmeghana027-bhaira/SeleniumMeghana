package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
//		is Displayed
		System.out.println(logo.isDisplayed());
//		 is Enabled - used for input name , radio btn , dropdowns and check boxses
		boolean checkInpu=driver.findElement(By.name("username")).isEnabled();
		System.out.println(checkInpu);
//		 is Selected - elemennt is selected or not checkbox , radiobtn , drowpdown 
		
	}

}

