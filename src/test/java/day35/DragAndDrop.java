package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement targetElement = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceElement, targetElement).perform();
	}

}
