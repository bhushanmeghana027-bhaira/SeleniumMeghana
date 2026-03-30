package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//this is without page factory 



public class LoginPage {
//	construnctors
	WebDriver driver;
		LoginPage(WebDriver driver){
			this.driver = driver;
		}
//		locators
		By txt_username = By.xpath("//input[@placeholder=\"Username\"]");
		By password= By.xpath("//input[@type=\"password\"]");
		By login = By.xpath("//button[@type=\"submit\"]");
		
//		actionmethods
		public void setUsername(String user) {
			driver.findElement(txt_username).sendKeys(user);
		}
		public void setPassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
		}
		public void clickLogin() {
			driver.findElement(login).click();
		}
}
