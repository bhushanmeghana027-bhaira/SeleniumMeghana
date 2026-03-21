package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickermethod
{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String year = "2026"; //expected data 
		String  month = "June";
		String day = "20";
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		selectMonthAndYear(driver,month,year);
		selectDate(driver,day);
	}
		// TODO Auto-generated method stub
	
		static void selectMonthAndYear(WebDriver driver,String month,String year) {
			while(true) 
			{
				String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
				String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
				
				if(currentMonth.equals(month) && currentYear.equals(year)) {
					break;
				}
//				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
}
			
			static void selectDate(WebDriver driver,String day) {
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
