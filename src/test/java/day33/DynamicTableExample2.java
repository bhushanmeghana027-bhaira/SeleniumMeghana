package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dynamictable.com/demos/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		step1] find total rows
//		driver.findElement(By.xpath("//table[@id=\"dynamicTable\"]//tr"));
		List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id=\"dynamicTable\"]//tr"));
		System.out.println("No of rows:"+totalRows.size());
		
//		step2] find totl cools
//		List<WebElement> totalCols = driver.findElements(By.xpath("//table[@id=\"dynamicTable\"]//tr[1]//th"));
//		System.out.println("No of rows:"+totalCols.size());
		
//		question 2: Print all the values in the Bold column.
//		//table[@id="dynamicTable"]//tr//td[2]
//		List<WebElement> boldNAme = driver.findElements(By.xpath("//table[@id=\"dynamicTable\"]//tr//td[2]"));
//		for(WebElement bName:boldNAme) {
//			System.out.println(bName.getText());
//		}
//		
		
//		question 3:Print the first 10 rows of the table.
//		System.out.println("Span"+"\t"+"Bold"+"\t"+"Anchor"+"\t"+"Amount");
//		for(int r=1;r<=10;r++) {
//		
//				WebElement dataq = driver.findElement(By.xpath("//table[@id=\"dynamicTable\"]//tr["+r+"]"));
//				System.out.println(dataq.getText()+ "\t");	
//		}
		
		
//		question4:]Print the last row of the table.
		
//		int lastRow = totalRows.size()-1;
//		System.out.println(lastRow);
//		
//		List<WebElement> lastRowData = driver.findElements(By.xpath("//table[@id=\"dynamicTable\"]//tr["+lastRow+"]"));
//		for(WebElement cell:lastRowData) {
//			System.out.println(cell.getText());
//		}
		
//		question 11]Find all Bold values with length > 10 characters.
//		for(int r=1;r<=totalRows.size();r++) {
//			WebElement boldlessthan10 = driver.findElement(By.xpath("//table[@id=\"dynamicTable\"]//tr["+r+"]//td[2]"));
////		System.out.println(boldlessthan10.getText().length());
//		if(boldlessthan10.getText().length()>10) {
//			System.out.println(boldlessthan10.getText());
//		}
//		
//		}
		
//		question12]Count how many rows have Span < 20
		for(int r=1;r<=totalRows.size();r++) {
			List<WebElement> spanlessthan20 = driver.findElements(By.xpath("//table[@id=\"dynamicTable\"]//tr["+r+"]//td[1]"));
//		System.out.println(boldlessthan10.getText().length());
		for(WebElement cellu:spanlessthan20)
		{
			String value = cellu.getText();
			int fvalue = Integer.parseInt(value);
			System.out.println(fvalue);
		}
		
		}
		
	
	}

}
