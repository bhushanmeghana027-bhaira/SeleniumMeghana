package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondTestCase {

	public static void main(String[] args) {
//		Step1 :Launching browser
		WebDriver driver = new EdgeDriver();
//		Step2 :Opening url 
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
//		Step3: read the title
		String actual_title_from_thepage = driver.getTitle();
		System.out.println(actual_title_from_thepage);
		if(actual_title_from_thepage.equals("The Internet")) {
			System.out.println("We matched");
		}
		else {
			System.out.println("We did not match");
		}
//		Step4: close browser
		driver.close();

	}

}
