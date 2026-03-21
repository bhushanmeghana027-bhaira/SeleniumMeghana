package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Laptop");
		driver.findElement(By.xpath("//select[@id=\"gh-cat\"]")).sendKeys("Computers/Tablets & Networking");
		driver.findElement(By.xpath("//button[@id=\"gh-search-btn\"]")).click();
		
		List<WebElement> laptops = driver.findElements(By.xpath("//span[@class=\"su-styled-text primary default\"]"));
		String firstLaptopTitle = laptops.get(3).getText();
		System.out.println(firstLaptopTitle);
		

	}

}
