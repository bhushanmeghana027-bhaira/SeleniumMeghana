package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1773682611506&no_sw_cr=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selemium");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		System.out.println(list.size());
		for(WebElement ele:list) {
			System.out.println(ele.getText());
			
		}
		Thread.sleep(6000);
		list.get(3).click();

	}

}
