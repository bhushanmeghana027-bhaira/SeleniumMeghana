package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBroserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs= driver.getWindowHandles();
		
//		first approach :convert set to list for looping
		List<String> windowList = new ArrayList(windowIDs);
//		String parentID = windowList.get(0);
//		String childID =  windowList.get(1);
//		
//		System.out.println(driver.getTitle()); 
//		System.out.println(driver.getCurrentUrl()); 
////		 still in parent window swithc to child window
//		driver.switchTo().window(childID);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl()); 
		
//		second approach using loops
		for(String winID:windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHrRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
