package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		step1:clicked the datepicker
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
//see whats currently visible as page opens : step2
		String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		System.out.println(currentMonth);
		String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		System.out.println(currentYear);
		
		try {
            Thread.sleep(5000);  // 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
//		give the target date month and year now step3
		String targetmonth = "June";
		String targetdate ="15";
		String targetyear = "1965";
		
//		step4
		while(true) 
		{
			if(currentMonth.equals(targetmonth) && currentYear.equals(targetyear)) {
				
			    break;
			    
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			
			currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		    currentYear  = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
//		    System.out.println("Now showing: " + currentMonth + " " + currentYear);
		    
		    try { Thread.sleep(3000); } 
		    catch (InterruptedException e) { 
		    
		    }
		}
//		    step5
		    List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
		    for(WebElement dq:dates) {
		    	if(targetdate.equals(dq.getText())) {
		    		dq.click();
		    		break;
		    	}
		    }
			
		
	}

}
