package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//1] launch browser
//2] open url https://automationexercise.com/
//3] Validate ttitle should be "Automation Exercise"
//4] close browser

public class HeadlessTesting {

	public static void main(String[] args) {
//		
////		1st step launchbrowser
////		ChromeDriver driver = new ChromeDriver();
////		alternatively u can rewrtite above statment as :  WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
////		********************************************************************************	
////		2nd step open url 
//		
//        driver.manage().window().maximize();
//        driver.get("https://automationexercise.com/");
////        ********************************************************************************	
////        3rd step  - validate tile 
//        String actual_title_from_page = driver.getTitle();
//        if(actual_title_from_page.equals("Automation Exercise")) {
//        	System.out.println("Expected actual title are same");
//        }
//        else {
//        	System.out.println("u r not same ");
//        }
//        
////        ********************************************************************************	
////        4th step close url
//        
//        driver.close();
//		
//		
		
//		 now same thing by headless testing
		ChromeOptions xo = new ChromeOptions();
		xo.addArguments("--headless=new");
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
