package day33;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPAginationTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/data_sources/ajax.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
