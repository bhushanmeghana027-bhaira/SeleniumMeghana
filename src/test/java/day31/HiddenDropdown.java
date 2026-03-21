package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.desktop-searchBar")).sendKeys("Kurta");
		 Thread.sleep(3000); // wait for suggestions
		  
		 List<WebElement> options = driver.findElements(By.cssSelector("li.desktop-suggestion"));
		 
		 System.out.println(options.size());
		 for(WebElement opt:options) {
			 System.out.println(opt.getText());
		 }
	}
	

}
