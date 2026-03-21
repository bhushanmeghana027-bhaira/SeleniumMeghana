package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		List<WebElement> total_rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
		System.out.println(total_rows.size());
	
		List<WebElement> total_col=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]//th"));
		System.out.println(total_col.size());
		
		WebElement name = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]"));
		System.out.println(name.getText());
		
		WebElement name1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]"));
		System.out.println(name1.getText());
		
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
//		without header
		for(int r=2;r<=total_rows.size();r++) {
			for(int c=1;c<=total_col.size();c++) {
				WebElement dataq = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]"));
				System.out.print(dataq.getText()+ "\t");
			}
			System.out.println();
			
		}
//		NOTE:
//		String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]")).getText();
//		System.out.println(bookName);
//		
//		the above two lines is same as
//		
//		WebElement name1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[7]//td[3]"));
//		System.out.println(name1.getText());
		
		
		for(int r=2;r<=total_rows.size();r++) {
			String authorName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh")) {
				System.out.println(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText() +"\t"+ authorName);
			}	
		}
		
		int total = 0;
		for(int r=2;r<=total_rows.size();r++) {
			String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			System.out.println(price);	
			total = total + Integer.parseInt(price);
			System.out.println(total);
		}
		
	
		
	}

}
