package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		checkBox.get(0).click();
		if(checkBox.get(1).isSelected()) {
			checkBox.get(1).click();
		}
	}

}
