package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Laptop");
		driver.findElement(By.xpath("//select[@id=\"gh-cat\"]")).sendKeys("Computers/Tablets & Networking");
		driver.findElement(By.xpath("//button[@id=\"gh-search-btn\"]")).click();

	}

}
