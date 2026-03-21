package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame_1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame_1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Meghana");
		driver.switchTo().defaultContent();
		
		
		WebElement fram2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(fram2);
		//input[@name="mytext2"]
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Meghana");
		driver.switchTo().defaultContent();
		
		WebElement fram3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(fram3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Meghana");
		driver.switchTo().frame(0);
		
		
	}

}
