package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/products");
		driver.findElement(By.name("search")).sendKeys("Top");
		driver.findElement(By.id("submit_search")).click();
//		driver.findElement(By.linkText("Cart")).click();
//		 className
		List<WebElement> headerLinks =driver.findElements(By.className("navbar-nav"));
		System.out.println(headerLinks.size());
		
//		tagName
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		System.out.println(headerLinks.size());
		
		List<WebElement> allImages =driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		System.out.println("Images is :"+allImages.size());
//		driver.findElement(By.className(""));
		
		

	}

}
