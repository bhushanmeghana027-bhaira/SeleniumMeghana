package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Page of the title:"+title);
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}

}
