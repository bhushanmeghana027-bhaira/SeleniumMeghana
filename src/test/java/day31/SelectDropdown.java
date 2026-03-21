package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();

	WebElement dropCountreyEl = driver.findElement(By.xpath("//select[@id=\"country\"]"));
	Select dropCountry = new Select(dropCountreyEl);
//	dropCountry.selectByVisibleText("France");
//	dropCountry.selectByValue("usa");
	dropCountry.selectByIndex(3);
	
	
//	capture all options
	List<WebElement> options = dropCountry.getOptions();
	System.out.println(options.size());
	
	for(WebElement opt:options) {
		System.out.println(opt.getText());
	}
	}

}
