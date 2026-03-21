package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("start-date")).sendKeys("12-06-2026");
		 try { Thread.sleep(3000); } catch (InterruptedException e) {}
		 
		 
		 driver.findElement(By.id("end-date")).sendKeys("22-06-2026");
		 driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).click();
		 
		 WebElement res = driver.findElement(By.xpath("//div[@id=\"result\"]"));
		 System.out.println(res.getText());

	}

}
