
package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement departure = driver.findElement(By.xpath("//select[@name = \"fromPort\"]"));
		Select sc = new Select(departure);
		sc.selectByIndex(2);
//		List<WebElement> alloptions = sc.getOptions();
//		System.out.println(alloptions.size());
		
		WebElement destination = driver.findElement(By.xpath("//select[@name = \"toPort\"]"));
		Select sc1 = new Select(destination);
		sc1.selectByVisibleText("Berlin");
		
		driver.findElement(By.xpath("//input[@type= \"submit\"]")).click();
		
//		 chossinhg the flight with least price Wele
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class=\"table\"]//tbody//tr"));
		int size = allrows.size();
		double minPrice = Double.MAX_VALUE;
		WebElement minRow = null;
		for(int i=1;i<=size;i++) {
			WebElement row = allrows.get(i - 1);
		    
			WebElement price = driver.findElement(By.xpath("//table[@class=\"table\"]//tbody//tr[" + i + "]//td[6]"));
			String priceText = price.getText();
			priceText = priceText.replace("$", "");
		    double pr = Double.parseDouble(priceText);
		    
		    if (pr < minPrice) {
		        minPrice = pr;
		        minRow = row;
		    }	
		    
		}
		System.out.println("Minimum price row: " + minRow.getText());
		WebElement chosseFlight  = minRow.findElement(By.xpath("//input[@type=\"submit\"]"));
		chosseFlight.click();
		
		

	}

}
