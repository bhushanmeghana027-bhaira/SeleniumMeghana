package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Practise5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("watch");
		driver.findElement(By.xpath("//select[@id=\"gh-cat\"]")).sendKeys("All Categories");
		driver.findElement(By.xpath("//button[@id=\"gh-search-btn\"]")).click();
		List<WebElement> watches = driver.findElements(By.xpath("//span[@class=\\\"su-styled-text primary default\\\"]"));
		Thread.sleep(5000);
		watches.get(3).click();
		


	}

}
