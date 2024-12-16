package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locate {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		//1.ByID
		driver.findElement(By.id("email")).sendKeys("Triotend@gmail.com");
		Thread.sleep(4000);
	    //2.By name
		driver.findElement(By.name("username")).clear();
		Thread.sleep(4000);
		//3.class name
		driver.findElement(By.className("form-password")).sendKeys("trio");
		Thread.sleep(4000);
		//4.tagname
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		//5.LinkText
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(4000);
		//6.xpath
		driver.findElement(By.xpath("//*[@id=\"form-username\"]")).sendKeys("test");
		Thread.sleep(4000);
		//7.cssSelector
		driver.findElement(By.cssSelector("body > div.top-content > div > div > div:nth-child(2) > div > div.form-bottom > form > button")).click();
		Thread.sleep(4000);
		//8.partial Linktext
		driver.findElement(By.partialLinkText("Admin")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("?")).click();
		
	}

}
