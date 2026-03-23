package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://developers.google.com/chart/interactive/docs/gallery");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[local-name()='g' and @clip-path='url(#clip0_4878_13714)']")).click();
		driver.findElement(By.xpath("//*[local-name()='g' and  .//*[local-name()='path' and contains(@d, 'M78.7746')]]"));
	}

}
