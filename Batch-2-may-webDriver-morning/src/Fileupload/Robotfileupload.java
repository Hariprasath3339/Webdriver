package Fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotfileupload {

	public static void main(String[] args) throws AWTException, Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://treecutting.triotend.com/documents.php");
		
		WebElement upload=driver.findElement(By.cssSelector("input#picture"));
		
		Actions act =new Actions(driver);
			
		act.click(upload).build().perform();
		
		
		StringSelection sel=new StringSelection("D:\\Fileupload\\test.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Thread.sleep(4000);
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
