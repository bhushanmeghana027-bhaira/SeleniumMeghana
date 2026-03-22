package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions xo = new ChromeOptions();
		xo.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(xo);
		driver.manage().window().maximize();
      driver.get("https://automationexercise.com/");
      String actual_title_from_page = driver.getTitle();
    if(actual_title_from_page.equals("Automation Exercise")) {
    	System.out.println("Expected actual title are same");
    }
    else {
    	System.out.println("u r not same ");
    }
    driver.close();
		
		

	}

}
