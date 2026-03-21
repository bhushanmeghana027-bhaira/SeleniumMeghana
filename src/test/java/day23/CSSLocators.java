package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
//		1] tage#idname
//		driver.findElement(By.id("small-searchterms")).sendKeys("galaxy");
//		above method u r rewriting using tag and id
//		WebElement searchBox = driver.findElement(By.cssSelector("input#small-searchterms"));
//		 alternatively :WebElement searchBox1 = driver.findElement(By.cssSelector("#small-searchterms"));
//		searchBox.sendKeys("Tshirts");
//		System.out.println("op is "+ searchBox);
		
//		2] tag.className
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("charger");
		
//		3]tag attribute
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("chargwer");
		
//	4] tag class attribute
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("pins");
		
		
	}

}
