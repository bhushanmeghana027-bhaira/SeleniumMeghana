package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://automationexercise.com/products");
	driver.manage().window().maximize();
//	1] xpath with single attribute
//	driver.findElement(By.xpath("//input[@placeholder=\"Search store\"]")).sendKeys("pins");
//	2] xpath with multiple attributes
//	driver.findElement(By.xpath(" //input[@name='q' and @aria-label='Search store']")).sendKeys("pins");
	
	
//	3] xpath with inner text 
//	driver.findElement(By.xpath("//a[text()=\" Products\"]")).click();
//	//a[text()=" Cart"]
////	driver.findElement(By.xpath("//p[text()='Blue Top']/following-sibling::a")).click();
//	
//	boolean displayStatus = driver.findElement(By.xpath("//h2[text() = \"Features Items\"]")).isDisplayed();
//	System.out.println(displayStatus);
//	
//	String valueDriver = driver.findElement(By.xpath("//h2[text() = \"Features Items\"]")).getText();
//	System.out.println(valueDriver);
//	
//	if(valueDriver.equals("FEATURES ITEMS")) {
//		System.out.println("same");
//	}
	
	
//	4] contains
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("masde");
//	driver.findElement(By.xpath("//input[starts-with(@value placeholder,'Search')]")).sendKeys("sojsdfj");
	}
	

}
