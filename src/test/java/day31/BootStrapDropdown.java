package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectors.webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-secondary dropdown-toggle'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=\"Broccoli\"]")).click();
		Thread.sleep(5000);
		System.out.println("i CLICKED");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-secondary dropdown-toggle'])[1]")).click();
		List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//button"));
		System.out.println(options.size());
	}

}
