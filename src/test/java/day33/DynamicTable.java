package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Step 1:  get the totl no of rows and cllumns
//		table [@class="table table-striped"]
		driver.findElement(By.xpath("//table [@class=\"table table-striped\"]"));
		List<WebElement> total_rows = driver.findElements(By.xpath("//table [@class=\"table table-striped\"]//tr"));
		System.out.println("Total rows:"+total_rows.size());
		
		
		List<WebElement> total_cols = driver.findElements(By.xpath("//table [@class=\"table table-striped\"]//tr[1]//th"));
		System.out.println("Total cols:"+total_cols.size());
		
//		step 2] get the data of every row and column 
		for(int r=1;r<=total_rows.size();r++) {
			for(int c=1;c<=total_cols.size();c++) {
				List<WebElement> dataq = driver.findElements(By.xpath("//table[@class=\"table table-striped\"]//tr["+r+"]//td["+c+"]"));
				for(WebElement eachdataq:dataq) {
					System.out.print(eachdataq.getText()+ "\t");
				}
			}
			System.out.println();
			
		}
//		step3] find chrome row u need to be able to highlight the whole chrome row 
		WebElement Chromerow = driver.findElement(By.xpath("//td[contains(text(),'Chrome')]/parent::tr"));
//		step4] get that rows all cell values u already pointed chromerow in step 3 
		
		List<WebElement>  ChromeRowName = Chromerow.findElements(By.tagName("td"));
		String chromeCPU ="";
		for(WebElement cell : ChromeRowName) {
		    if(cell.getText().contains("%")) {
		         chromeCPU = cell.getText();
		        break;
		    }
		}
		System.out.println("Chrome CPU: "+chromeCPU);
		
		String questionPaperValue = driver.findElement(By.xpath("//p[contains(@class, 'bg-warning')]")).getText();
		System.out.println(questionPaperValue);
		
			}
		
		
		

	}


