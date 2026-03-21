package day28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://automationexercise.com/");
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://automationexercise.com/view_cart");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		

	}

}
