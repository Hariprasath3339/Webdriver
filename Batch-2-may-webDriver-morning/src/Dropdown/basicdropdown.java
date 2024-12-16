package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		
		driver.switchTo().frame(frm);
		
		WebElement drp=driver.findElement(By.cssSelector("select#cars"));
		
		Select sdrp=new Select(drp);
		
		sdrp.selectByIndex(2);
		Thread.sleep(4000);
		sdrp.selectByValue("audi");
		Thread.sleep(4000);
		sdrp.selectByVisibleText("Volvo");
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
