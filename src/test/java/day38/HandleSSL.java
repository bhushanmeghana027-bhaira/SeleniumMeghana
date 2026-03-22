package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions xo = new ChromeOptions();
		xo.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(xo);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	

	}

}
