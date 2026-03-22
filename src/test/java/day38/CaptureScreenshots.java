package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		mathod 1 : full page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\screenshotsfolder\\fullpage.png");
		sourceFile.renameTo(target); // this will copy source file to target location that is wherever we want 
		
//		method 2 : we want particular section 
		WebElement featureditems = driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div/section[2]"));
		File sourceFile1 = featureditems.getScreenshotAs(OutputType.FILE);
		File target1 = new File(System.getProperty("user.dir")+"\\screenshotsfolder\\featureditems.png");
		sourceFile1.renameTo(target1); 
		
//		method 3 : capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		File sourceFile2 = logo.getScreenshotAs(OutputType.FILE);
		File target2 = new File(System.getProperty("user.dir")+"\\screenshotsfolder\\logo.png");
		sourceFile2.renameTo(target2); 
		
		
		

	}

}
