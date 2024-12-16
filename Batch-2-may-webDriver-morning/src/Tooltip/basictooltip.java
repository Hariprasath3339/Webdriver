package Tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basictooltip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		
		WebElement cart=driver.findElement(By.cssSelector("span.count"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cart).build().perform();
		
		
		WebElement tooltip=driver.findElement(By.cssSelector("p.woocommerce-mini-cart__empty-message"));
		
		
		System.out.println(tooltip.getText());

	}

}
