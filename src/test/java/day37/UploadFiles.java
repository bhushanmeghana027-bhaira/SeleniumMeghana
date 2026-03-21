package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
//		single file uploaded
//		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\megha\\Downloads\\sdc.jpg");
//		
//		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("sdc.jpg"))
//				{
//			System.out.println("FileUploaded ");
//		}
//	
//		mu;ltiple files
		String file1 = "C:\\Users\\megha\\Downloads\\sdc.jpg";
		String file2 = "C:\\Users\\megha\\Downloads\\oio.jpg";
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(file1+"\n"+file2);
		int noOfFiles = driver.findElements(By.xpath("//ul[@id=\"fileList\"]")).size();
		
		if(noOfFiles==2) {
			System.out.println("All files uploaded");
		}
		else {
			System.out.println("Not uploaded");
		}
		
//		validate file name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("sdc.jpg") 
				   && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("oio.jpg")) {
			System.out.println("all files uploaded succesfully");
		}
		else {
			System.out.println("No files uploaded");
		}
	}

}
