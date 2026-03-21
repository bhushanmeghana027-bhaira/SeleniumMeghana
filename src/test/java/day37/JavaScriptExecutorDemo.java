package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		by xpath genral method how we do 
//		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Bhaira");
//      
//		now we will do the same using js executor
		
		WebElement input = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')", input);
//		it shld always be arguments[0] as we are passing only one args that is input 
		
		
		WebElement genderBtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", genderBtn);
		
		
		
	}

}
