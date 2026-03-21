package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCSwitchHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[contains(@aria-label,'Confirmation')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'circletwo')]")).click();
		String parentWindow = driver.getWindowHandle();
		for(String window:driver.getWindowHandles()) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
			}
		}
		driver.findElement(By.xpath("//span[text()='Bus Tickets']")).click();
		String parentWindow1 = driver.getWindowHandle();
		for(String window1:driver.getWindowHandles()) {
			if(!window1.equals(parentWindow1)) {
				driver.switchTo().window(window1);
				System.out.println(driver.getTitle());
			}
		}
		driver.findElement(By.xpath("//span[text()=\"Maharajas'\"]")).click();
		
		List<String> windo = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windo.get(0));
		driver.getTitle();
		driver.close();
		
		driver.switchTo().window(windo.get(3));
		driver.getTitle();
		driver.close();
		}
	
	
		

}


