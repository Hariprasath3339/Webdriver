package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		
		WebElement btn=driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));

		Actions act=new Actions(driver);
		act.doubleClick(btn).build().perform();
		
		
		
	}

}
