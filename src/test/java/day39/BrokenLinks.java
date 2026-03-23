package day39;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * steps to follow 
 * 1] capture all links
 * 2]in for read each and every link capture the href value 
 * if it is null or empty skip it ,if not open to serven basically connect to server
 */
public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
//		capture href value
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int noOfBrokenLinks=0;
		for(WebElement linkElement:links) {
			String hrefValue = linkElement.getAttribute("href");
			if(hrefValue==null || hrefValue.isEmpty()) {
				System.out.println("href value is null or empty , so it is not posiible to check");
				continue;
			}
		
		
//		send href value to serve 
//		href is in string format it needs to be in url format so convert 
		try {

		//		URL linkURL = new URL(hrefValue);
		URL linkURL = URI.create(hrefValue).toURL();
		HttpURLConnection connLinkURL = (HttpURLConnection)linkURL.openConnection();
		connLinkURL.connect();
		
		if(connLinkURL.getResponseCode() >= 400) {
			System.out.println(hrefValue+ "==>Its a broken link");
			noOfBrokenLinks++;
		}
		else {
			System.out.println("goof link");
		}
		}
		catch(Exception e ){
			
		}
		}
		
		System.out.println("No of broken links :"+noOfBrokenLinks);
		
		

	}

}
