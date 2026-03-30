package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
//	construnctors
	WebDriver driver;
		LoginPageWithPageFactory(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
//		locators
//		By txt_username = By.xpath("//input[@placeholder=\"Username\"]");
//		By password= By.xpath("//input[@type=\"password\"]");
//		By login = By.xpath("//button[@type=\"submit\"]");
		
		@FindBy(xpath = "//input[@placeholder='Username']")
		WebElement txt_username;
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement txt_password;
		@FindBy(xpath = "//button[@type=\"submit\"]")
		WebElement btn_login;

		
		
		
//		actionmethods
		public void setUsername(String user) {
			txt_username.sendKeys(user);
		}
		public void setPassword(String pwd) {
			txt_password.sendKeys(pwd);
		}
		public void clickLogin() {
			btn_login.click();
		}
}
