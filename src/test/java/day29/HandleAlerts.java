package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		1] normal alert with ok button 
//		driver.findElement(By.xpath("//button[@id=\"alertBtn\"]")).click();
//		Thread.sleep(5000);
//		Alert myAlert = driver.switchTo().alert();
//		System.out.println(myAlert.getText());
//		myAlert.accept();
//		2] alert with confirmation button
//		driver.findElement(By.xpath("//button[@id=\"confirmBtn\"]")).click();
//		Thread.sleep(5000);
////		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		3] prompt alert
		driver.findElement(By.xpath(("//*[@id=\"promptBtn\"]"))).click();
		Thread.sleep(5000);
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("poi");
		myAlert.accept();
		
		
//		
		
		}
}
