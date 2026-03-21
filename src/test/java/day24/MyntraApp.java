package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraApp {

	public static void main(String[] args) throws InterruptedException {
//		step 1] open the browser and launch myntra
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElements(By.cssSelector("img.image-image undefined image-hand")).get(0).click();
		
//		step 2] locate search box and search jackets
		
//		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
////		System.out.println("op is:"+ searchBox);
//		searchBox.sendKeys("Jackets");
//		searchBox.sendKeys(Keys.ENTER);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//		
//		driver.findElement(By.linkText("Women")).click();
//		Thread.sleep(5000);
		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		
//		 step 1] 

	}

}
