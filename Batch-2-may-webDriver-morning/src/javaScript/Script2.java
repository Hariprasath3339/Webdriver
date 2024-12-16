package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://erp.triotend.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
				
		//Login script
		js.executeScript("document.getElementById('user_email').value='tester'");
		js.executeScript("document.getElementById('password').value='test'");
		js.executeScript("document.getElementById('login_button').click()");
         Thread.sleep(12000);
         //To click on hidden element
         WebElement pro=driver.findElement(By.xpath("//a[@href='javascript:produnav();']"));
         js.executeScript("arguments[0].click()", pro);
         Thread.sleep(4000);
         //To navigate
         js.executeScript("window.location='http://erp.triotend.com/salesinvoice.php'");
       //To scroll particular height
         Thread.sleep(4000);
         js.executeScript("window.scrollBy(0,400)");
         Thread.sleep(4000);
         
       //To scroll particular Element
         WebElement txt=driver.findElement(By.cssSelector("input#amountPaid"));
         js.executeScript("arguments[0].scrollIntoView(true)", txt);
         
       //To scroll End
 		Thread.sleep(4000);
 		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 		
	}

}
