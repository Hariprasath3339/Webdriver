package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/ecom/");
		
		WebElement mainmenu=driver.findElement(By.cssSelector("ul.main-header-menu>li"));
		WebElement submenu=driver.findElement(By.cssSelector("ul.sub-menu>li:nth-child(2)"));
				
		Actions act=new Actions(driver);
		
		act.moveToElement(mainmenu).build().perform();
		Thread.sleep(4000);
		act.moveToElement(submenu).build().perform();
		Thread.sleep(4000);
		act.click().build().perform();
		
		
		
		

	}

}
