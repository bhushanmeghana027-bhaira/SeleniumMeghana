package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//min slider
		WebElement minElement = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		Thread.sleep(5);
		System.out.println(minElement.getLocation().getX());
		System.out.println(minElement.getLocation().getY());
		System.out.println(minElement.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(minElement, 100, 0).build().perform();
		System.out.println("element location after moving:"+minElement.getLocation());
		
//		max slider
		WebElement maxElement = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default ui-state-focus\"]"));
		Thread.sleep(2000);
		System.out.println(maxElement.getLocation());
		act.dragAndDropBy(maxElement, -200, 0).build().perform();
		System.out.println("After moving:"+maxElement.getLocation());

	}

}
