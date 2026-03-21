package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePtckerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
//	method 1
//	driver.switchTo().frame(0);
//	driver.findElement(By.id("datepicker")).sendKeys("12/12/2020"); //mm-dd-yyyy
//	
//method 2
	String year = "2026"; //expected data 
	String  month = "June";
	String day = "20";
	driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	
//	select month and year
	while(true) {
		String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		
		if(currentMonth.equals(month) && currentYear.equals(year)) {
			break;
		}
////		futute yr and month 
		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
//
//		//		past yr and month 
//		driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
	}
	
//		capture all dates
		List<WebElement> dates =  driver.findElements(By.xpath("//div[@id=\"ui-datepicker-div\"]//tbody//tr//td//a"));
		for(WebElement dt:dates) 
		{
			if(dt.getText().equals(day)){
				
			
				dt.click();
				break;
			}
		}
	}
}


			
		




