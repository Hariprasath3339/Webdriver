package Fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitUpload {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://treecutting.triotend.com/documents.php");
		
		WebElement upload=driver.findElement(By.cssSelector("input#picture"));
		
		Actions act =new Actions(driver);
		
		act.click(upload).build().perform();
		
		Runtime.getRuntime().exec("D:\\Fileupload\\uploadfile.exe"+" "+"D:\\Fileupload\\test.docx");
		
		
	}

}
