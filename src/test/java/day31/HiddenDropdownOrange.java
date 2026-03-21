package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdownOrange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
//		password
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();
//		invisible dropdown 
//		Thread.sleep(10000);
		
//		driver.findElement(By.xpath("(//i[contains(@class,'oxd-select-text--arrow')])[3]")).click();
//		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option']//span"));
//		
//		System.out.println(options.size());
//		for(WebElement op:options) {
//			System.out.println(op.getText());
////			
			
//			one more invisible dropdown
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text--after\"])[1]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role=\"option\"]//span"));
		System.out.println(options.size());
		for(WebElement op:options) {
			System.out.println(op.getText());
			
		}
		
		
		
		

	}

}
