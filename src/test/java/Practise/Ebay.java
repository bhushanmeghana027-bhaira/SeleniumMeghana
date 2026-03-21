package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
//		 driver.findElement(By.linkText("Sell")).click();
		 
//		 driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("jackets");
//		 driver.findElement(By.xpath("//*[@value=\"1281\"]")).click();
//		 driver.findElement(By.className("gh-search-button__label")).click();
		 
//		 driver.findElement(By.xpath("//span[text()=\"Home and garden\"]")).click();
//		 driver.findElement(By.className("vl-flyout-nav__more-label")).click();
//		 driver.findElement(By.xpath("//*[text()=\"Women's Coats\"]")).click();
//		 driver.findElement(By.linkText("Make it last")).click();
		 
//		 driver.findElement(By.className("bc-item-detail-title")).click();
		 driver.findElement(By.xpath("//*[contains(@title,\"MacBook Pro\")]")).click();
		 String parent = driver.getWindowHandle();
		 for(String window: driver.getWindowHandles()) {
			 if(!window.equals(parent)) {
				 driver.switchTo().window(window);
			 }
		 }
		 String title = driver.getTitle();
		 System.out.println(title);

	}

}
