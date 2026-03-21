package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.navigate().to("https://www.ebay.com/");
//		driver.navigate().refresh();
		driver.navigate().back();
		

	}

}
