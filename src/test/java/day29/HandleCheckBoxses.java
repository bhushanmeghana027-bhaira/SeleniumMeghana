package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxses {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("sunday")).click();
//		clicking all chekboxes
		List<WebElement> checkBoxses = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for(int i=0;i<=checkBoxses.size();i++) {
//			checkBoxses.get(i).click();
//		}
//		for(WebElement checkBoxy : checkBoxses) {
//			checkBoxy.click();
//		}
//		select last 3 
//		for(int i=4;i<=checkBoxses.size();i++) {
//			checkBoxses.get(i).click();
//		}
//		select first 3 
//		for(int i=0;i<=2;i++) {
//			checkBoxses.get(i).click();
//		}
//		unselect check boxses
//		for(WebElement checky:checkBoxses) {
//			checky.click();
//		}
//		Thread.sleep(5000);
//		for(WebElement checky:checkBoxses) {
//			checky.click();
//		}
		
//		unselecting checkBoxses
		
		for(int i=0;i<=2;i++) {
			checkBoxses.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<=2;i++) {
			if(checkBoxses.get(i).isSelected()) {
				checkBoxses.get(i).click();
			}
			
		}

		

	}

}
