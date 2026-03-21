package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(6000);
//		driver.findElement(By.linkText("ArtOfTesting")).click();
//		driver.findElement(By.className("menu-bar-item")).click();
//		driver.findElement(By.partialLinkText("AoT")).click();
//		driver.findElement(By.linkText("Performance")).click();
//		driver.findElement(By.xpath("//*[@id=\"menu-item-313\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"menu-item-605\"]")).click();
//		driver.findElement(By.linkText("This is a link")).click();
//		driver.findElement(By.id("fname")).sendKeys("Meghana");
//		driver.findElement(By.id("idOfButton")).click();
////		driver.findElement(By.id("dblClkBtn")).click().click();
//		 WebElement element = driver.findElement(By.id("dblClkBtn"));
//
//	        Actions action = new Actions(driver);
//	        action.doubleClick(element).perform();
//driver.findElement(By.id("male")).click();
//driver.findElement(By.cssSelector("input.Performance")).click();
//driver.findElement(By.id("testingDropdown")).click();
//driver.findElement(By.xpath("//option[@id=\"database\"]")).click();
//driver.findElement(By.xpath("//button[@onclick=\"generateAlertBox()\"]")).click();

		
		driver.findElement(By.linkText("Automation")).click();
		driver.findElement(By.xpath("//li[@id=\"menu-item-1005\"]")).click();
	}

}
