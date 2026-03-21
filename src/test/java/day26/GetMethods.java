package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		String pageSource = driver.getPageSource();
//		System.out.println("pageSource is" +pageSource);
//		String windowID = driver.getWindowHandle();
//		System.out.println("windowID :"+ windowID);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		Set<String> windowHnadlers = driver.getWindowHandles();
		System.out.println("windoeHandlers:"+windowHnadlers);
		

	}

}
