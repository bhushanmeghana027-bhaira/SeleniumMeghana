package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverPackage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement Electronics = driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
		WebElement Camera = driver.findElement(By.xpath("//a[text()=\"Cameras and photo\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		Thread.sleep(5000);
		act.moveToElement(Camera).click().perform();
		
		
	}

}
