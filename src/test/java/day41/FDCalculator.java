package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		step 1 . launch application 
//		step 2 . read the data from the row pass to the calculator 
//		

//		step a . launch application
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/simple-interest-calculator.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		step b . give the file ppath 
		String filepath = System.getProperty("user.dir")+ "//testdata//calculate.xlsx";
		
		int rows = ExcelUtil.getRowCount(filepath,"Sheet1");
		
//		read data from xl 
//		pass above data into aplication 
//		validation
		for(int i=1;i<=rows;i++) {
//			 read data from xl 
			String pric = ExcelUtil.getCellData(filepath, "Sheet1", i, 0);
			String roi = ExcelUtil.getCellData(filepath, "Sheet1", i, 1);
			String rateType = ExcelUtil.getCellData(filepath, "Sheet1", i, 2);
			String term = ExcelUtil.getCellData(filepath, "Sheet1", i, 3);
			String termType = ExcelUtil.getCellData(filepath, "Sheet1", i, 4);
			String endBalance = ExcelUtil.getCellData(filepath, "Sheet1", i, 5);
			
//			 pass data into application
			driver.findElement(By.xpath("//img[@class=\"clearbtn\"]")).click();
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			driver.findElement(By.xpath("//input[@name='rate']")).sendKeys(roi);
			
			WebElement ratebasedropdown = driver.findElement(By.xpath("//select[@name='ratebase']"));
			Select sc = new Select(ratebasedropdown);
			sc.selectByVisibleText(rateType);
			
			driver.findElement(By.xpath("//input[@name='term']")).sendKeys(term);
			
			WebElement termbasedropdown = driver.findElement(By.xpath("//select[@name='termbase']"));
			Select sc1 = new Select(termbasedropdown);
			sc1.selectByVisibleText(termType);
			
			driver.findElement(By.xpath("//input[@value=\"Calculate\"]")).click();
			
			String  endBalanceApp = driver.findElement(By.xpath("//td[b[text()='End Balance:']]/following-sibling::td/b")).getText();
			endBalanceApp = endBalanceApp.replace("$", "").replace(",", "");
																																																										
			if(Double.parseDouble(endBalance) == Double.parseDouble(endBalanceApp)) {
				System.out.println("test passed");
				ExcelUtil.setCellData(filepath,"Sheet1",i,7,"Pass");
				ExcelUtil.fillGreenColor(filepath, "Sheet1", i, 7);
			}
			else {
				System.out.println("test failed");
				ExcelUtil.setCellData(filepath,"Sheet1",i,7,"Fail");
				ExcelUtil.fillRedColor(filepath, "Sheet1", i, 7);
			}
			Thread.sleep(3000);
			
			
			
		}
		driver.quit();
	}

}
